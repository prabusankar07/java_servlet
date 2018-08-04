package com.lms.controller;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.lms.beans.LabDetailsBean;
import com.lms.beans.LabExtensionRequestBean;
import com.lms.beans.LabReleaseRequestBean;
import com.lms.beans.LabRequestBean;
import com.lms.beans.LoginBean;
import com.lms.service.LabDeleteService;
import com.lms.service.LabDetailsService;
import com.lms.service.LabExtensionRequestService;
import com.lms.service.LabExtensionUpdateService;
import com.lms.service.LabReleaseRequestService;
import com.lms.service.LabReleaseUpdateService;
import com.lms.service.LabRequestService;
import com.lms.service.LabRequestUpdateService;
import com.lms.service.LabSearchService;
import com.lms.service.LabUpdateService;
import com.lms.service.LoginService;

/**
 * Servlet implementation class LMSController
 */
public class LMSController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LMSController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("object created");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("object deleted");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  String task = request.getParameter("activity");
		  System.out.println(task);
		  RequestDispatcher rd = null;
		  if(task.equals("login")){
			  HttpSession session = request.getSession(false);
				 
				 if(session==null || session.isNew())
				 {
					 response.sendRedirect("Expired.jsp");
				 }
		
				 else{
					 session.setMaxInactiveInterval(100);
	    		String name = request.getParameter("username");
	    		
	    		String pass = request.getParameter("password");
	    			    	    		
	    		response.setContentType("text/html");
	    			    	
	    	 	LoginBean lb = new LoginBean(name,pass);
	    		
	    		LoginService ls = new LoginService();
	    		
	    		String check = ls.validateLogin(lb);
	    		System.out.println(check);
	    		session.setAttribute("check", check);
	    		if(check.equals("LO"))
	    		{
	    			request.setAttribute("user", name);
	    		  rd = request.getRequestDispatcher("HomeLO.jsp");
	    			
	    		  rd.include(request, response);
	    			
	    		}else if(check.equals("OTH"))
	    		{
	    			request.setAttribute("user", name);
	    			rd = request.getRequestDispatcher("HomeOTH.jsp");
	    				    			 			 
	    			rd.include(request, response);
	    			
	    		}else if(check.equals("OTM"))
	    		{ 
	    			request.setAttribute("user", name);
	    			rd = request.getRequestDispatcher("HomeOTM.jsp");
	    				    			 			 
	    			rd.include(request, response);
	    			
	    		}else if(check.equals("null"))
	    		{ 
	    			request.setAttribute("errlog", "invalid credentials");  
	    			rd = request.getRequestDispatcher("LoginPage.jsp");
	    			rd.include(request, response);
	    		}
	    		
	    	 
	}}
		  else if (task.equals("addlabdetails")) {
			  HttpSession session = request.getSession(false);
				 
				 if(session==null ||session.isNew())
				 {
					 response.sendRedirect("Expired.jsp");
				 }
				 else{
					 session.setMaxInactiveInterval(100);
			         boolean flag=false;
			
			    String labID = request.getParameter("labID");
	    		String name = request.getParameter("type");
	    		String labtype = request.getParameter("labtype");
	    		String capacity = request.getParameter("capacity");
	    		String country = request.getParameter("mycountry");
	    		String city = request.getParameter("city");
	    		String status = request.getParameter("status");
	    		String sysavl = request.getParameter("sysavl");
	    		String wboard = request.getParameter("wboard");
	    		String ac = request.getParameter("ac");
	    		String projector = request.getParameter("projector");
	    		String phone = request.getParameter("phone");
	    		String mike = request.getParameter("mike");
	    		String soundsys = request.getParameter("soundsys");
	    		String videoconf = request.getParameter("videoconf");
	    		
	    	response.setContentType("text/html");
	    	
	    	 LabDetailsBean ldb= new LabDetailsBean(labID,name,labtype,capacity,country,city,status,sysavl,wboard,ac,projector,phone,mike,soundsys,videoconf);
	    		
	    	LabDetailsService lds = new LabDetailsService();
	    	
	    	flag=lds.addLab(ldb);
	    	if (flag==true){
	    		   PrintWriter out = response.getWriter();
				out .println("<script type=\"text/javascript\">");
	    		   out.println("alert('lab details inserted successfully');");
	    		   out.println("location='AddLabDetails.jsp';");
	    		   out.println("</script>");
	    		   rd = request.getRequestDispatcher("AddLabDetails.jsp");
	    			rd.include(request, response);
	    		
	    	}
	    	else {
	    		   PrintWriter out = response.getWriter();
				out .println("<script type=\"text/javascript\">");
	    		   out.println("alert('lab details insert failed try again');");
	    		   out.println("location='AddLabDetails.jsp';");
	    		   out.println("</script>");
	    		   rd = request.getRequestDispatcher("AddLabDetails.jsp");
	    			rd.include(request, response);
	    		
	    	}
		}
		  }else if (task.equals("search")) {
			 HttpSession session = request.getSession(false);
			 
			 if(session==null ||session.isNew())
			 {
				 response.sendRedirect("Expired.jsp");
			 }
			 else{
				 session.setMaxInactiveInterval(100);
			String sear = request.getParameter("searchlab");
			String log=(String) session.getAttribute("check");
			System.out.println(log);
			LabSearchService ls = new LabSearchService();
			if(sear.equals("all_labs")){
				request.setAttribute("search", " of All Labs");
    		List<LabDetailsBean> li = new ArrayList<LabDetailsBean>();
    				li=ls.getLabDetails();
    				if(log.equals("LO"))
    				{
    		  request.setAttribute("data", li);
    		   rd = request.getRequestDispatcher("SearchResultsLO.jsp");
    		   rd.forward(request, response);
    				}else if(log.equals("OTM")){
    		   request.setAttribute("data", li);
    		 rd = request.getRequestDispatcher("SearchResultsOTM.jsp");
    		 rd.forward(request, response);
    				}else if(log.equals("OTH"))
    				{
    		 request.setAttribute("data", li);
    		  rd = request.getRequestDispatcher("SearchResultsOTH.jsp");
    		  rd.forward(request, response);
    				}
    		}
    		if(sear.equals("search_ID")){
    			
    			String searchid=request.getParameter("labsearchbyID");
    			session.setAttribute("searchid", searchid );
    			request.setAttribute("search", "By ID");
    			
    			List<LabDetailsBean> li = new ArrayList<LabDetailsBean>();
        				li=ls.getLabDetailsByID(request, response);
        	if(li.isEmpty()){
                 System.out.println("hello"); 
              if(log.equals("LO"))
				{
            	  request.setAttribute("errsearch", "Lab Not Found"); 
            	  rd = request.getRequestDispatcher("SearchResultsLO.jsp");
            	  rd.forward(request, response);
				}else if(log.equals("OTM")){
					request.setAttribute("errsearch", "Lab Not Found"); 
					rd = request.getRequestDispatcher("SearchResultsOTM.jsp");
					rd.forward(request, response);
				}else if(log.equals("OTH"))
				{
					request.setAttribute("errsearch", "Lab Not Found"); 
					rd = request.getRequestDispatcher("SearchResultsOTH.jsp");
					rd.forward(request, response);
				}
             }else{
            	 if(log.equals("LO"))
 				{
 		  request.setAttribute("data", li);
 		   rd = request.getRequestDispatcher("SearchResultsLO.jsp");
 		   rd.forward(request, response);
 				}else if(log.equals("OTM")){
 		   request.setAttribute("data", li);
 		 rd = request.getRequestDispatcher("SearchResultsOTM.jsp");
 		 rd.forward(request, response);
 				}else if(log.equals("OTH"))
 				{
 		 request.setAttribute("data", li);
 		  rd = request.getRequestDispatcher("SearchResultsOTH.jsp");
 		  rd.forward(request, response);
 				}
        		}
    		}
    		if(sear.equals("search_city")){
    			
    			String searchid=request.getParameter("labsearchbyplace");
    			session.setAttribute("searchid", searchid );
    			request.setAttribute("search", "By City");
    			List<LabDetailsBean> li = new ArrayList<LabDetailsBean>();
        				li=ls.getLabDetailsByPlace(request, response);
        if(li.isEmpty()){
        	 if(log.equals("LO"))
				{
         	  request.setAttribute("errsearch", "Lab Not Found"); 
         	  rd = request.getRequestDispatcher("SearchResultsLO.jsp");
         	  rd.forward(request, response);
				}else if(log.equals("OTM")){
					request.setAttribute("errsearch", "Lab Not Found"); 
					rd = request.getRequestDispatcher("SearchResultsOTM.jsp");
					rd.forward(request, response);
				}else if(log.equals("OTH"))
				{
					request.setAttribute("errsearch", "Lab Not Found"); 
					rd = request.getRequestDispatcher("SearchResultsOTH.jsp");
					rd.forward(request, response);
				}
        		
        		 }
        else{
        	if(log.equals("LO"))
			{
	  request.setAttribute("data", li);
	   rd = request.getRequestDispatcher("SearchResultsLO.jsp");
	   rd.forward(request, response);
			}else if(log.equals("OTM")){
	   request.setAttribute("data", li);
	 rd = request.getRequestDispatcher("SearchResultsOTM.jsp");
	 rd.forward(request, response);
			}else if(log.equals("OTH"))
			{
	 request.setAttribute("data", li);
	  rd = request.getRequestDispatcher("SearchResultsOTH.jsp");
	  rd.forward(request, response);
			}
        		}
    		}


		}}
		  else if (task.equals("deactivatelab")) {
			 HttpSession session = request.getSession(false);
			 
			 if(session==null ||session.isNew())
			 {
				 response.sendRedirect("Expired.jsp");
			 }
			 else{
				 session.setMaxInactiveInterval(100);
			LabSearchService ls = new LabSearchService();
			String sear=request.getParameter("sear");
				String searchid=request.getParameter("labID");
    			session.setAttribute("searchid", searchid );
    			session.setAttribute("search", "By ID");
    			List<LabDetailsBean> li = new ArrayList<LabDetailsBean>();
        		li=ls.getLabDetailsByID(request, response);
        		  request.setAttribute("data", li);
        		 if(li.isEmpty()){
        			 request.setAttribute("errdel", "Lab Not Found"); 
        			  System.out.println("hello"); 
        			  rd = request.getRequestDispatcher("DeactivateLab.jsp");
          		    rd.forward(request, response);
          		 }else{
        			  System.out.println("hellooooooo");        			        			  
               		  rd = request.getRequestDispatcher("Deactivate.jsp");
            		    rd.forward(request, response);
        		  }
		}}else if (task.equals("deactivate")) {
			 HttpSession session = request.getSession(false);
			 
			 if(session==null ||session.isNew())
			 {
				 response.sendRedirect("Expired.jsp");
			 }
			 else{
				 session.setMaxInactiveInterval(100);
			boolean check = false;
			response.setContentType("text/html");
    		String id = request.getParameter("id");
    		 LabDetailsBean ldb= new LabDetailsBean(id);
    		LabDeleteService lds = new LabDeleteService();
    		check = lds.deleteLab(ldb);
    		System.out.println(check);
    		if (check==true){
	    		   PrintWriter out = response.getWriter();
				out .println("<script type=\"text/javascript\">");
	    		   out.println("alert('lab details Deleted successfully');");
	    		   out.println("location='DeactivateLab.jsp';");
	    		   out.println("</script>");
	    		   rd = request.getRequestDispatcher("Deactivate.jsp");
	    			rd.include(request, response);
	    		
	    	}
    	
	    	else if (check==false){
	    		   PrintWriter out = response.getWriter();
				out .println("<script type=\"text/javascript\">");
	    		   out.println("alert('lab details delete failed try again');");
	    		   out.println("location='DeactivateLab.jsp';");
	    		   out.println("</script>");
	    		   rd = request.getRequestDispatcher("Deactivate.jsp");
	    			rd.include(request, response);
	    		
	    	}
		}}
		else if (task.equals("update")) 
		{
			 HttpSession session = request.getSession(false);
			 
			 if(session==null ||session.isNew())
			 {
				 response.sendRedirect("Expired.jsp");
			 }
			 else{
				 session.setMaxInactiveInterval(100);
				String log=(String) session.getAttribute("check");
				System.out.println(log);
                 String sear = request.getParameter("labID");
			    LabSearchService ls = new LabSearchService();		
    		    session.setAttribute("searchid", sear );
    			List<LabDetailsBean> li = new ArrayList<LabDetailsBean>();
        		li=ls.getLabDetailsByID(request, response);
        		  request.setAttribute("data", li);
        		  if(li.isEmpty()){
        			  if(log.equals("OTM")){
      					request.setAttribute("errsearch", "Lab Not Found"); 
      					rd = request.getRequestDispatcher("UpdateOTM.jsp");
      					rd.forward(request, response);
      				}else if(log.equals("OTH"))
      				{
      					request.setAttribute("errsearch", "Lab Not Found"); 
      					rd = request.getRequestDispatcher("UpdateOTH.jsp");
      					rd.forward(request, response);
      				}
          	  			 
        		  }else{
        			  System.out.println("hellooooooo");  
        			  if(log.equals("OTH")){
        				  rd = request.getRequestDispatcher("UpdateLabDetailsOTH.jsp");
        				  rd.forward(request, response);
        			  }
        			  else if(log.equals("OTM")){
        			  rd = request.getRequestDispatcher("UpdateLabDetailsOTM.jsp");
        			   rd.forward(request, response);
        		  }
        		  }
        		 
		}
		}else if (task.equals("updatelab")) 
		{	 
			 HttpSession session = request.getSession(false);
			 
			 if(session==null ||session.isNew())
			 {
				 response.sendRedirect("Expired.jsp");
			 }
			 else{
				 String log=(String) session.getAttribute("check");
				 session.setMaxInactiveInterval(100);
			boolean flag=false;
			String labID = request.getParameter("id");
    		String name = request.getParameter("type");
    		String labtype = request.getParameter("labtype");
    		String capacity = request.getParameter("capacity");
    		String country = request.getParameter("mycountry");
    		String city = request.getParameter("city");
    		String status = request.getParameter("status");
    		String sysavl = request.getParameter("sysavl");
    		String wboard = request.getParameter("wboard");
    		String ac = request.getParameter("ac");
    		String projector = request.getParameter("projector");
    		String phone = request.getParameter("phone");
    		String mike = request.getParameter("mike");
    		String soundsys = request.getParameter("soundsys");
    		String videoconf = request.getParameter("videoconf");
    		
    	response.setContentType("text/html");
   	
    	 LabDetailsBean ldb= new LabDetailsBean(labID,name,labtype,capacity,country,city,status,sysavl,wboard,ac,projector,phone,mike,soundsys,videoconf);
    		
    	LabUpdateService lus = new LabUpdateService();
    	
    	flag=lus.updateLab(ldb);
    	if (flag==true){
    		if(log.equals("OTH"))
			{
    		   PrintWriter out = response.getWriter();
			out .println("<script type=\"text/javascript\">");
    		   out.println("alert('lab details updated successfully');");
    		   out.println("location='UpdateOTH.jsp';");
    		     out.println("</script>");
    		   rd = request.getRequestDispatcher("UpdateOTH.jsp");
 			 	rd.include(request, response);
			}else if(log.equals("OTM")) {
				 PrintWriter out = response.getWriter();
					out .println("<script type=\"text/javascript\">");
		    		   out.println("alert('lab details updated successfully');");
		    		    out.println("location='UpdateOTM.jsp';");
		    		   out.println("</script>");
		    		   rd = request.getRequestDispatcher("UpdateOTM.jsp");
		    			rd.include(request, response);
				
			}
    	}
    	else {
    		if(log.equals("OTM")) {
    		   PrintWriter out = response.getWriter();
			out .println("<script type=\"text/javascript\">");
    		   out.println("alert('lab details update failed try again');");
    		     out.println("location='UpdateOTM.jsp';");
    		   out.println("</script>");
    		    rd = request.getRequestDispatcher("UpdateOTM.jsp");
    			rd.include(request, response);
    		}else if(log.equals("OTH")) {
     		   PrintWriter out = response.getWriter();
   			out .println("<script type=\"text/javascript\">");
       		   out.println("alert('lab details update failed try again');");
       		     out.println("location='UpdateOTH.jsp';");
       		   out.println("</script>");
       		    rd = request.getRequestDispatcher("UpdateOTH.jsp");
       			rd.include(request, response);
       		}
    	}
		}
		}
    	else if (task.equals("labExtend")) {
    		 HttpSession session = request.getSession(false);
			 
			 if(session==null ||session.isNew())
			 {
				 response.sendRedirect("Expired.jsp");
			 }
			else{
					 session.setMaxInactiveInterval(100);
					 boolean flag=false;
					
				     String searchId=request.getParameter("searchid");
				     String sear=request.getParameter("req");
				     if(sear.equals("searchlab"))
				     {
				    	 
				    	 LabRequestBean lrrb=new LabRequestBean(searchId);
							LabReleaseUpdateService leus = new LabReleaseUpdateService();
						  	List<LabRequestBean> li = new ArrayList<LabRequestBean>();
				    		li=leus.getRequestDetailsById(searchId);
				    		request.setAttribute("data", li);
				    		
				    		  if(li.isEmpty()){
			        			  request.setAttribute("errrequest", "Lab Not Found"); 
			        			  System.out.println("hello"); 
			        			  rd = request.getRequestDispatcher("LabExtensionRequest.jsp");
			        			  rd.forward(request, response);
			          	  			 
			        		  }else{
			        			  System.out.println("hellooooooo");        			        			  
			        			  rd = request.getRequestDispatcher("LabExtensionRequest.jsp");
			 		    		 rd.forward(request, response);
			        		  }
				     }
					 
				     else if(sear.equals("Request"))
				     {
			    String bookingId = request.getParameter("bookingID");
	    		String labId = request.getParameter("labID");
	    		String labName = request.getParameter("type");
	    		String location = request.getParameter("city");
	    		String trainingName = request.getParameter("training");
	    		String loName = request.getParameter("loName");
	    		String startDate = request.getParameter("sdate");
	    		String endDate = request.getParameter("edate");
	    		String extensionDate = request.getParameter("exdate");
	    		String approval= request.getParameter("approval");
	    	    		
	    	response.setContentType("text/html");
	    	LabExtensionRequestBean leb= new LabExtensionRequestBean(bookingId,labId,labName,location,trainingName,loName,startDate,endDate,extensionDate,approval);
	    	LabExtensionRequestService les = new LabExtensionRequestService();
	    	
	    	flag=les.labExtension(leb);
	    	if (flag==true)
	    	{
	    		   PrintWriter out = response.getWriter();
				   out .println("<script type=\"text/javascript\">");
	    		   out.println("alert('lab extension request inserted successfully');");
	    		   out.println("location='LabExtensionRequest.jsp';");
	    		   out.println("</script>");
	    		   rd = request.getRequestDispatcher("LabExtensionRequest.jsp");
	    		   rd.include(request, response);
	    		
	    	}else if (flag==false)
	    	{
	    		   PrintWriter out = response.getWriter();
				   out .println("<script type=\"text/javascript\">");
	    		   out.println("alert('lab extension request failed');");
	    		   out.println("location='LabExtensionRequest.jsp';");
	    		   out.println("</script>");
	    		   rd = request.getRequestDispatcher("LabExtensionRequest.jsp");
	    		   rd.include(request, response);
	    		
	    	}
		

	}	}
    	}else if (task.equals("labReleaseRequest")) {
		 HttpSession session = request.getSession(false);
		 
		 if(session==null ||session.isNew())
		 {
			 response.sendRedirect("Expired.jsp");
		 }
		 else{
			 session.setMaxInactiveInterval(100);
			 boolean flag=false;
			
		     String searchId=request.getParameter("searchid");
		     String sear=request.getParameter("req");
		     if(sear.equals("searchlab"))
		     {
		    	 
		    	 LabRequestBean lrrb=new LabRequestBean(searchId);
					LabReleaseUpdateService leus = new LabReleaseUpdateService();
				  	List<LabRequestBean> li = new ArrayList<LabRequestBean>();
		    		li=leus.getRequestDetailsById(searchId);
		    		request.setAttribute("data", li);
		    		
		    		  if(li.isEmpty()){
	        			  request.setAttribute("errrequest", "Lab Not Found"); 
	        			  System.out.println("hello"); 
	        			  rd = request.getRequestDispatcher("LabReleaseRequest.jsp");
	        			  rd.forward(request, response);
	          	  			 
	        		  }else{
	        			  System.out.println("hellooooooo");        			        			  
	        			  rd = request.getRequestDispatcher("LabReleaseRequest.jsp");
	 		    		 rd.forward(request, response);
	        		  }
		     }
			 
		     else if(sear.equals("Request"))
		     {
		System.out.println("arun");
		String bookingId = request.getParameter("bookingID");
  		String labId = request.getParameter("labID");
  		String labName = request.getParameter("type");
  		String location = request.getParameter("city");
  		String trainingName = request.getParameter("training");
  		String loName = request.getParameter("loName");
  		String startDate = request.getParameter("sdate");
  		String endDate = request.getParameter("edate");
  		String releaseDate = request.getParameter("reldate");
  	String approval=null;
  		
  	response.setContentType("text/html");
  	LabReleaseRequestBean lrrb= new LabReleaseRequestBean(bookingId,labId,labName,location,trainingName,loName,startDate,endDate,releaseDate,approval);
  	
  	LabReleaseRequestService lrrs = new LabReleaseRequestService();
  	
  	flag=lrrs.labReleaseRequest(lrrb);
  	if (flag==true)
  	{
  		   PrintWriter out = response.getWriter();
			   out .println("<script type=\"text/javascript\">");
  		   out.println("alert('lab release request inserted successfully');");
  		   out.println("location='LabReleaseRequest.jsp';");
  		   out.println("</script>");
  		   rd = request.getRequestDispatcher("LabReleaseRequest.jsp");
  		   rd.include(request, response);
  		
  	}else if (flag==true)
  	{
		   PrintWriter out = response.getWriter();
			   out .println("<script type=\"text/javascript\">");
		   out.println("alert('lab release request failed ');");
		   out.println("location='LabReleaseRequest.jsp';");
		   out.println("</script>");
		   rd = request.getRequestDispatcher("LabReleaseRequest.jsp");
		   rd.include(request, response);
		
	}
}}
	}
		else if (task.equals("extensionupdate")){
			 HttpSession session = request.getSession(false);
			 
			 if(session==null ||session.isNew())
			 {
				 response.sendRedirect("Expired.jsp");
			 }
			 else{
				 session.setMaxInactiveInterval(100);
			response.setContentType("text/html");
			String log=(String) session.getAttribute("check");
			String sear = request.getParameter("extension");
			if(sear.equals("viewrequest"))
			{
				
				LabExtensionUpdateService leus = new LabExtensionUpdateService();
			  		List<LabExtensionRequestBean> li = new ArrayList<LabExtensionRequestBean>();
	    				li=leus.getExtensionDetails();
	    				if(log.equals("OTH")){
	    			  request.setAttribute("data", li);
	    		   rd = request.getRequestDispatcher("ExtensionUpdateOTH.jsp");
	    		 	   rd.forward(request, response);
	    				}else if(log.equals("OTM")){
	  	    			  request.setAttribute("data", li);
	  		    		   rd = request.getRequestDispatcher("ExtensionUpdateOTM.jsp");
	  		    		 	   rd.forward(request, response);
	  		    			}
	    		}
			else if(sear.equals("approve"))
			{		
					boolean flag=false;
					List<LabExtensionRequestBean> li = new ArrayList<LabExtensionRequestBean>();
		    		String[] approve= request.getParameterValues("approve");
		    		session.setAttribute("approve", approve );	    	   	
		    	   	LabExtensionUpdateService leus = new LabExtensionUpdateService();
		    	   	flag= leus.getExtensionDetails(request,response);
		    	   	System.out.println(flag);
		    	   	if (flag==true)
		    	  	{
		    	   		if(log.equals("OTH")){
		    	  		   PrintWriter out = response.getWriter();
		    				   out .println("<script type=\"text/javascript\">");
		    	  		   out.println("alert('lab approved');");
		    	  		   out.println("location='ExtensionUpdateOTH.jsp';");
		    	  			   out.println("</script>");
		    	  		  rd = request.getRequestDispatcher("ExtensionUpdateOTH.jsp");
			    		     rd.include(request, response);
		    	   		}else if(log.equals("OTM")){
		    	   		 PrintWriter out = response.getWriter();
	    				   out .println("<script type=\"text/javascript\">");
	    	  		   out.println("alert('lab approved');");
	    	  		   out.println("location='ExtensionUpdateOTH.jsp';");
	    	  			   out.println("</script>");
	    	  		  rd = request.getRequestDispatcher("ExtensionUpdateOTH.jsp");
		    		     rd.include(request, response);
		    	   		}
		    	   		}
				
		    	  	else if (flag==false)
		    	  	{if(log.equals("OTM")){
		    	  		   PrintWriter out = response.getWriter();
		    				   out .println("<script type=\"text/javascript\">");
		    	  		   out.println("alert('lab approval failed try again');");
		    	  		 out.println("location='ExtensionUpdateOTM.jsp';");
		    	  		   out.println("</script>");
		    	  		  rd = request.getRequestDispatcher("ExtensionUpdateOTM.jsp");
		    	  		   rd.include(request, response);
		    	  	}else if(log.equals("OTH")){
		    	  		   PrintWriter out = response.getWriter();
		    				   out .println("<script type=\"text/javascript\">");
		    	  		   out.println("alert('lab approval failed try again');");
		    	  		 out.println("location='ExtensionUpdateOTH.jsp';");
		    	  		   out.println("</script>");
		    	  		  rd = request.getRequestDispatcher("ExtensionUpdateOTH.jsp");
		    	  		   rd.include(request, response);
		    	  	}
		    	  	}
		    	

			
		}}
		}
else if (task.equals("requestupdate")){
			 HttpSession session = request.getSession(false);
			 
			 if(session==null ||session.isNew())
			 {
				 response.sendRedirect("Expired.jsp");
			 }
			 else{
				 session.setMaxInactiveInterval(100);
			response.setContentType("text/html");
			String log=(String) session.getAttribute("check");
			String sear = request.getParameter("extension");
			if(sear.equals("viewrequest"))
			{
				
				LabRequestUpdateService leus = new LabRequestUpdateService();
			  		List<LabRequestBean> li = new ArrayList<LabRequestBean>();
	    				li=leus.getRequestDetails();
	    		if(log.equals("OTH"))
	    		{
	    			  request.setAttribute("data", li);
	    		   rd = request.getRequestDispatcher("RequestUpdateOTH.jsp");
	    		   rd.forward(request, response);
	    		}else if(log.equals("OTM"))
	    		{
	    			  request.setAttribute("data", li);
	    		   rd = request.getRequestDispatcher("RequestUpdateOTM.jsp");
	    		   rd.forward(request, response);
	    		}
			}
			else if(sear.equals("approve"))
			{		
			
					boolean flag=false;
					List<LabRequestBean> li = new ArrayList<LabRequestBean>();
		    		String[] approve= request.getParameterValues("approve");
		    		session.setAttribute("approve", approve );	
		    		System.out.println(approve);
		    		LabRequestUpdateService leus = new LabRequestUpdateService();
		    	   	flag= leus.getRequestDetails(request,response);
		    	   	System.out.println(flag);
		    	   	if (flag==true)
		    	  	{ if(log.equals("OTM"))
		    	  	{
		    	  		   PrintWriter out = response.getWriter();
		    				out .println("<script type=\"text/javascript\">");
		    	  		   out.println("alert('lab approved');");
		    	  		     out.println("location='RequestUpdateOTM.jsp';");
		    	  		   out.println("</script>");
		    	  		   rd = request.getRequestDispatcher("RequestUpdateOTM.jsp");
		    	  		   rd.include(request, response);
		    	  	}else  if(log.equals("OTH"))
		    	  	{
		    	  		   PrintWriter out = response.getWriter();
		    				out .println("<script type=\"text/javascript\">");
		    	  		   out.println("alert('lab approved');");
		    	  		     out.println("location='RequestUpdateOTH.jsp';");
		    	  		   out.println("</script>");
		    	  		   rd = request.getRequestDispatcher("RequestUpdateOTH.jsp");
		    	  		   rd.include(request, response);
		    	  	}
		    	  	}else if (flag==false)
		    	  	{	if(log.equals("OTH")){
		    	  		   PrintWriter out = response.getWriter();
		    				   out .println("<script type=\"text/javascript\">");
		    	  		   out.println("alert('lab approval failed try again');");
		    	  		 out.println("location='RequestUpdateOTH.jsp';");
		    	  	  	  		   out.println("</script>");
		    	  		  rd = request.getRequestDispatcher("RequestUpdateOTH.jsp");
		    	  		 	   rd.include(request, response);
		    	  		
		    	  	}else if(log.equals("OTM")){
		    	  		   PrintWriter out = response.getWriter();
		    				   out .println("<script type=\"text/javascript\">");
		    	  		   out.println("alert('lab approval failed try again');");
		    	  		 out.println("location='RequestUpdateOTM.jsp';");
		    	  	  	  		   out.println("</script>");
		    	  		  rd = request.getRequestDispatcher("RequestUpdateOTM.jsp");
		    	  		 	   rd.include(request, response);
		    	  		
		    	  	}
		    	  	}
		    	

			}
		}}else if (task.equals("releaseupdate")){
			 HttpSession session = request.getSession(false);
			 
			 if(session==null ||session.isNew())
			 {
				 response.sendRedirect("Expired.jsp");
			 }
			 else
			 {
				 session.setMaxInactiveInterval(100);
				 String log=(String) session.getAttribute("check");
			response.setContentType("text/html");
			String sear = request.getParameter("extension");
			if(sear.equals("viewrequest"))
			{
				
				LabReleaseUpdateService leus = new LabReleaseUpdateService();
			  		List<LabReleaseRequestBean> li = new ArrayList<LabReleaseRequestBean>();
	    				li=leus.getRequestDetails();
	    				if(log.equals("OTM"))
	    				{
	    			  request.setAttribute("data", li);
	    		   rd = request.getRequestDispatcher("ReleaseUpdateOTM.jsp");
	    		   	   rd.forward(request, response);
	    				}else if(log.equals("OTH")) {
	    					  request.setAttribute("data", li);
	    		    		   rd = request.getRequestDispatcher("ReleaseUpdateOTH.jsp");
	    		    		   	   rd.forward(request, response);
	    				}
	    		}
			else if(sear.equals("approve"))
			{		
			
					boolean flag=false;
					List<LabReleaseRequestBean> li = new ArrayList<LabReleaseRequestBean>();
		    		String[] approve= request.getParameterValues("approve");
		    		session.setAttribute("approve", approve );	
		    		System.out.println(approve);
		    		LabReleaseUpdateService lrus = new LabReleaseUpdateService();
		    	   	flag= lrus.getReleaseDetails(request,response);
		    	   	System.out.println(flag);
		    	   	if (flag==true)
		    	  	{
		    	   		if(log.equals("OTH"))
		    	   		{
		    	  		   PrintWriter out = response.getWriter();
		    	  		   out .println("<script type=\"text/javascript\">");
		    	  		   out.println("alert('lab approved');");
		    	  		   out.println("location='ReleaseUpdateOTH.jsp';");
		    	  	       out.println("</script>");
		    	  		   rd = request.getRequestDispatcher("ReleaseUpdateOTH.jsp");
		    	  		   rd.include(request, response);
		    	   		}else if(log.equals("OTM"))
		    	   		{
			    	  		   PrintWriter out = response.getWriter();
			    	  		   out .println("<script type=\"text/javascript\">");
			    	  		   out.println("alert('lab approved');");
			    	  		   out.println("location='ReleaseUpdateOTM.jsp';");
			    	  	       out.println("</script>");
			    	  		   rd = request.getRequestDispatcher("ReleaseUpdateOTM.jsp");
			    	  		   rd.include(request, response);
			    	   		}
		    	  	}else if (flag==false)
		    	  	{if(log.equals("OTM"))
		    	  	{
		    	  		   PrintWriter out = response.getWriter();
		    			   out .println("<script type=\"text/javascript\">");
		    	  		   out.println("alert('lab approval failed try again');");
		    	  		    out.println("location='ReleaseUpdateOTM.jsp';");
		    	  		   out.println("</script>");
		    	  		   rd = request.getRequestDispatcher("ReleaseUpdateOTM.jsp");
			    		   rd.include(request, response);
		    	  	}else if(log.equals("OTH"))
		    	  	{
		    	  		   PrintWriter out = response.getWriter();
		    			   out .println("<script type=\"text/javascript\">");
		    	  		   out.println("alert('lab approval failed try again');");
		    	  		    out.println("location='ReleaseUpdateOTH.jsp';");
		    	  		   out.println("</script>");
		    	  		   rd = request.getRequestDispatcher("ReleaseUpdateOTH.jsp");
			    		   rd.include(request, response);
		    	  	}
		    	  	}
			}

			}}else if (task.equals("release")){
				HttpSession session = request.getSession(false);
				 
				 if(session==null ||session.isNew())
				 {
					 response.sendRedirect("Expired.jsp");
				 }
				 else{
					 session.setMaxInactiveInterval(100);
				response.setContentType("text/html");
				String sear = request.getParameter("extension");
				if(sear.equals("viewrequest"))
				{
					
					LabReleaseUpdateService leus = new LabReleaseUpdateService();
				  		List<LabReleaseRequestBean> li = new ArrayList<LabReleaseRequestBean>();
		    				li=leus.getRequestDetails();
		    			  request.setAttribute("data", li);
		    		   rd = request.getRequestDispatcher("Release.jsp");
		    		   rd.forward(request, response);
		    	}						
					
		}}else if (task.equals("request")){
			 HttpSession session = request.getSession(false);
			 
			 if(session==null ||session.isNew())
			 {
				 response.sendRedirect("Expired.jsp");
			 }else{
				 session.setMaxInactiveInterval(100);
			response.setContentType("text/html");
			String sear = request.getParameter("extension");
			if(sear.equals("viewrequest"))
			{
				
				LabRequestUpdateService leus = new LabRequestUpdateService();
			  		List<LabRequestBean> li = new ArrayList<LabRequestBean>();
	    				li=leus.getRequestDetails();
	    			  request.setAttribute("data", li);
	    		   rd = request.getRequestDispatcher("Request.jsp");
	    		   rd.forward(request, response);
	    		}
	}}
		else if (task.equals("extension")){
			 HttpSession session = request.getSession(false);
			 
			 if(session==null ||session.isNew())
			 {
				 response.sendRedirect("Expired.jsp");
			 }
			 else{
				 session.setMaxInactiveInterval(100);
			response.setContentType("text/html");
			String sear = request.getParameter("extension");
			if(sear.equals("viewrequest"))
			{
				
				LabExtensionUpdateService leus = new LabExtensionUpdateService();
			  		List<LabExtensionRequestBean> li = new ArrayList<LabExtensionRequestBean>();
	    				li=leus.getExtensionDetails();
	    			  request.setAttribute("data", li);
	    		   rd = request.getRequestDispatcher("Extension.jsp");
	    		   rd.forward(request, response);
	    		}
	}}
		else if (task.equals("labRequest")) {
			 HttpSession session = request.getSession(false);
			 
			 if(session==null && session.isNew())
			 {
				 response.sendRedirect("Expired.jsp");
			 }
			 else{
				 session.setMaxInactiveInterval(100);
			     boolean flag=false;
			     String searchid=request.getParameter("searchid");
			     String sear=request.getParameter("req");
			     if(sear.equals("searchlab"))
				  {
			    	 session.setAttribute("searchid", searchid );
		    			request.setAttribute("search", "By ID");
		    			LabSearchService ls = new LabSearchService();
		    			List<LabDetailsBean> li = new ArrayList<LabDetailsBean>();
		        	li=ls.getLabDetailsByID(request, response);
		        	if(li.isEmpty()){
		               request.setAttribute("errsearch", "Lab Not Found"); 
		              System.out.println("hello"); 
		                rd = request.getRequestDispatcher("LabRequest.jsp");
		                rd.forward(request, response);
		             }else{
		        		  request.setAttribute("data", li);
		        		 
		        		  rd = request.getRequestDispatcher("LabRequest.jsp");
		        		  
		        		  rd.forward(request, response);
		        		}
				  }
				  else if(sear.equals("Request"))
				  {
			     
			    String bookingId = request.getParameter("bookingID");
	    		String labId = request.getParameter("labID");
	    		String location = request.getParameter("city");
	    		String labName = request.getParameter("type");
	            String trainingName = request.getParameter("training");
	    		String loName = request.getParameter("loName");
	    		String startDate = request.getParameter("sdate");
	    		String endDate = request.getParameter("edate");
	    	    String approval= request.getParameter("approval");
	    	    		
	    	response.setContentType("text/html");
	    	LabRequestBean lrb= new LabRequestBean(bookingId,labId,location,labName,trainingName,loName,startDate,endDate,approval);
	    	LabRequestService lrs = new LabRequestService();
	    	
	    	flag=lrs.labRequest(lrb);
	    	if (flag==true)
	    	{
	    		   PrintWriter out = response.getWriter();
				   out .println("<script type=\"text/javascript\">");
	    		   out.println("alert('lab request inserted successfully');");
	    		   out.println("location='LabRequest.jsp';");
	    		   out.println("</script>");
	    		   rd = request.getRequestDispatcher("LabRequest.jsp");
	    		   rd.include(request, response);
	    		
	    	}
		}
			     }
		
		}
}
}









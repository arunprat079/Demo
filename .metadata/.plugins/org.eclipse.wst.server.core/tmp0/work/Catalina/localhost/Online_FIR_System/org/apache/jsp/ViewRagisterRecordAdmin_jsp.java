/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2018-04-11 09:37:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.pojo.Registration;
import java.util.List;
import com.model.BLManger;

public final class ViewRagisterRecordAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/adminheader.jsp", Long.valueOf(1523438950714L));
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1522082159331L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>View Register Record</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("<title>Admin Header</title>\r\n");
      out.write("<!-- Bootstrap core CSS-->\r\n");
      out.write("<link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- Custom fonts for this template-->\r\n");
      out.write("<link href=\"vendor/font-awesome/css/font-awesome.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<!-- Page level plugin CSS-->\r\n");
      out.write("<link href=\"vendor/datatables/dataTables.bootstrap4.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<!-- Custom styles for this template-->\r\n");
      out.write("<link href=\"css/sb-admin.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"fixed-nav sticky-footer bg-dark\" id=\"page-top\">\r\n");
      out.write("\t<!-- Navigation-->\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\"\r\n");
      out.write("\t\tid=\"mainNav\">\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"UserpropartyAdminServlate\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></a>\r\n");
      out.write("\t\t<button class=\"navbar-toggler navbar-toggler-right\" type=\"button\"\r\n");
      out.write("\t\t\tdata-toggle=\"collapse\" data-target=\"#navbarResponsive\"\r\n");
      out.write("\t\t\taria-controls=\"navbarResponsive\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\taria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav navbar-sidenav\" id=\"exampleAccordion\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\"\r\n");
      out.write("\t\t\t\t\ttitle=\"Dashboard\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\thref=\"CriminalDetailAdmin.jsp\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-fw fa-dashboard\"></i> <span class=\"nav-link-text\">Add\r\n");
      out.write("\t\t\t\t\t\t\tCriminal Record</span>\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\"\r\n");
      out.write("\t\t\t\t\ttitle=\"Charts\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\thref=\"PoliceStationRecord.jsp\"> <i class=\"fa fa-fw fa-file\"></i>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"nav-link-text\">Add PoliceStation</span>\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\"\r\n");
      out.write("\t\t\t\t\ttitle=\"Charts\"><a class=\"nav-link\" href=\"AdminRecord.jsp\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-fw fa-file\"></i> <span class=\"nav-link-text\">Add\r\n");
      out.write("\t\t\t\t\t\t\tAdmin</span>\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\"\r\n");
      out.write("\t\t\t\t\ttitle=\"Tables\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\thref=\"ViewCriminalDetailAdmin.jsp\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-fw fa-table\"></i> <span class=\"nav-link-text\">View\r\n");
      out.write("\t\t\t\t\t\t\tCriminal Record</span>\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\"\r\n");
      out.write("\t\t\t\t\ttitle=\"Tables\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\thref=\"ViewRagisterRecordAdmin.jsp\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-fw fa-table\"></i> <span class=\"nav-link-text\">View\r\n");
      out.write("\t\t\t\t\t\t\tRegister Record</span>\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\"\r\n");
      out.write("\t\t\t\t\ttitle=\"Components\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link nav-link-collapse collapsed\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\thref=\"#collapseComponents\" data-parent=\"#exampleAccordion\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-fw fa-wrench\"></i> <span class=\"nav-link-text\">View\r\n");
      out.write("\t\t\t\t\t\t\tComplain Record</span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"sidenav-second-level collapse\" id=\"collapseComponents\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"SearchMissingForAdmin.jsp\">Missing Complain\r\n");
      out.write("\t\t\t\t\t\t\t\tRecord</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"SearchTheftRecordAdmin.jsp\">Theft Complain\r\n");
      out.write("\t\t\t\t\t\t\t\tRecord</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"SearchFIRRecordAdmin.jsp\">FIR Complain\r\n");
      out.write("\t\t\t\t\t\t\t\tRecord</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\"\r\n");
      out.write("\t\t\t\t\ttitle=\"Tables\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\thref=\"ViewMissingStatusAdmin.jsp\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-fw fa-wrench\"></i> <span class=\"nav-link-text\">View\r\n");
      out.write("\t\t\t\t\t\t\tComplain Status</span>\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\"\r\n");
      out.write("\t\t\t\t\ttitle=\"Tables\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\thref=\"ChangePasswordAdmin.jsp\"> <i class=\"fa fa-fw fa-sitemap\"></i>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"nav-link-text\">Change Password</span>\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<!-- li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\"\r\n");
      out.write("\t\t\t\t\ttitle=\"Link\"><a class=\"nav-link\" href=\"#\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-fw fa-link\"></i> <span class=\"nav-link-text\">Link</span>\r\n");
      out.write("\t\t\t\t</a></li -->\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav sidenav-toggler\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link text-center\"\r\n");
      out.write("\t\t\t\t\tid=\"sidenavToggler\"> <i class=\"fa fa-fw fa-angle-left\"></i>\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\t\t\t\t<!-- li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle mr-lg-2\" id=\"messagesDropdown\"\r\n");
      out.write("\t\t\t\t\thref=\"#\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <i class=\"fa fa-fw fa-envelope\"></i> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"d-lg-none\">Messages <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"badge badge-pill badge-primary\">12 New</span>\r\n");
      out.write("\t\t\t\t\t</span> <span class=\"indicator text-primary d-none d-lg-block\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-fw fa-circle\"></i>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- div class=\"dropdown-menu\" aria-labelledby=\"messagesDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<h6 class=\"dropdown-header\">New Messages:</h6>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\"> <strong>David\r\n");
      out.write("\t\t\t\t\t\t\t\tMiller</strong> <span class=\"small float-right text-muted\">11:21\r\n");
      out.write("\t\t\t\t\t\t\t\tAM</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-message small\">Hey there! This new\r\n");
      out.write("\t\t\t\t\t\t\t\tversion of SB Admin is pretty awesome! These messages clip off\r\n");
      out.write("\t\t\t\t\t\t\t\twhen they reach the end of the box so they don't overflow over\r\n");
      out.write("\t\t\t\t\t\t\t\tto the sides!</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\"> <strong>Jane Smith</strong>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"small float-right text-muted\">11:21 AM</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-message small\">I was wondering if you\r\n");
      out.write("\t\t\t\t\t\t\t\tcould meet for an appointment at 3:00 instead of 4:00. Thanks!</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\"> <strong>John Doe</strong> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"small float-right text-muted\">11:21 AM</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-message small\">I've sent the final\r\n");
      out.write("\t\t\t\t\t\t\t\tfiles over to you for review. When you're able to sign off of\r\n");
      out.write("\t\t\t\t\t\t\t\tthem let me know and we can discuss distribution.</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item small\" href=\"#\">View all messages</a>\r\n");
      out.write("\t\t\t\t\t</div -->\r\n");
      out.write("\t\t\t\t</li -->\r\n");
      out.write("\t\t\t\t<!-- li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle mr-lg-2\" id=\"alertsDropdown\"\r\n");
      out.write("\t\t\t\t\thref=\"#\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <i class=\"fa fa-fw fa-bell\"></i> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"d-lg-none\">Alerts <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"badge badge-pill badge-warning\">6 New</span>\r\n");
      out.write("\t\t\t\t\t</span> <span class=\"indicator text-warning d-none d-lg-block\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-fw fa-circle\"></i>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<!-- div class=\"dropdown-menu\" aria-labelledby=\"alertsDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<h6 class=\"dropdown-header\">New Alerts:</h6>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\"> <span class=\"text-success\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong> <i class=\"fa fa-long-arrow-up fa-fw\"></i>Status\r\n");
      out.write("\t\t\t\t\t\t\t\t\tUpdate\r\n");
      out.write("\t\t\t\t\t\t\t</strong>\r\n");
      out.write("\t\t\t\t\t\t</span> <span class=\"small float-right text-muted\">11:21 AM</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-message small\">This is an automated\r\n");
      out.write("\t\t\t\t\t\t\t\tserver response message. All systems are online.</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\"> <span class=\"text-danger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong> <i class=\"fa fa-long-arrow-down fa-fw\"></i>Status\r\n");
      out.write("\t\t\t\t\t\t\t\t\tUpdate\r\n");
      out.write("\t\t\t\t\t\t\t</strong>\r\n");
      out.write("\t\t\t\t\t\t</span> <span class=\"small float-right text-muted\">11:21 AM</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-message small\">This is an automated\r\n");
      out.write("\t\t\t\t\t\t\t\tserver response message. All systems are online.</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\"> <span class=\"text-success\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong> <i class=\"fa fa-long-arrow-up fa-fw\"></i>Status\r\n");
      out.write("\t\t\t\t\t\t\t\t\tUpdate\r\n");
      out.write("\t\t\t\t\t\t\t</strong>\r\n");
      out.write("\t\t\t\t\t\t</span> <span class=\"small float-right text-muted\">11:21 AM</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-message small\">This is an automated\r\n");
      out.write("\t\t\t\t\t\t\t\tserver response message. All systems are online.</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item small\" href=\"#\">View all alerts</a>\r\n");
      out.write("\t\t\t\t\t</div -->\r\n");
      out.write("\t\t\t\t</li -->\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t<!-- form class=\"form-inline my-2 my-lg-0 mr-lg-2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Search for...\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input-group-append\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-search\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form -->\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" data-toggle=\"modal\"\r\n");
      out.write("\t\t\t\t\tdata-target=\"#exampleModal\"> <i class=\"fa fa-fw fa-sign-out\"></i>Logout\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<div class=\"content-wrapper\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<!-- Breadcrumbs-->\r\n");
      out.write("\t\t\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t<li class=\"breadcrumb-item\"><a href=\"admin.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"breadcrumb-item active\">My Home Page</li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t\t<!-- Icon Cards-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Scroll to Top Button-->\r\n");
      out.write("\t\t\t<a class=\"scroll-to-top rounded\" href=\"#page-top\"> <i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-angle-up\"></i>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<!-- Logout Modal-->\r\n");
      out.write("\t\t\t<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("\t\t\t\taria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to\r\n");
      out.write("\t\t\t\t\t\t\t\tLeave?</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"close\" type=\"button\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\t\t\taria-label=\"Close\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span aria-hidden=\"true\">×</span>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b><br>Select \"Logout\" below if you are\r\n");
      out.write("\t\t\t\t\t\t\tready to end your current session.\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-secondary\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn btn-primary\" href=\"login.html\">Logout</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- Bootstrap core JavaScript-->\r\n");
      out.write("\t\t\t<script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\t\t\t<!-- Core plugin JavaScript-->\r\n");
      out.write("\t\t\t<script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\t\t\t<!-- Page level plugin JavaScript-->\r\n");
      out.write("\t\t\t<script src=\"vendor/chart.js/Chart.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"vendor/datatables/jquery.dataTables.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"vendor/datatables/dataTables.bootstrap4.js\"></script>\r\n");
      out.write("\t\t\t<!-- Custom scripts for all pages-->\r\n");
      out.write("\t\t\t<script src=\"js/sb-admin.min.js\"></script>\r\n");
      out.write("\t\t\t<!-- Custom scripts for this page-->\r\n");
      out.write("\t\t\t<script src=\"js/sb-admin-datatables.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"js/sb-admin-charts.min.js\"></script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");

		BLManger bl = new BLManger();
		List<Registration> l = bl.registrationsearchlist();
		session.setAttribute("li", l);
	
      out.write("\r\n");
      out.write("\t<div class=\"card mb-3\">\r\n");
      out.write("\t\t<div class=\"card-header\">\r\n");
      out.write("\t\t\t<i class=\"fa fa-table\"></i>Register Record\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t<div class=\"table-responsive\">\r\n");
      out.write("\t\t\t\t<table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\"\r\n");
      out.write("\t\t\t\t\tcellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Register No.</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>User Type</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Police Station Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Address</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>City</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Email</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Mobile No.</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Action</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Action</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tfoot>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Register No.</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>User Type</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Police Station Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Address</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>City</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Email</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Mobile No.</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Action</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Action</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tfoot>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"card-footer small text-muted\">Record</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\t<footer class=\"sticky-footer\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t<small>Made By Arun Pratap</small>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</footer>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\t<footer class=\"sticky-footer\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t<small>Made By Arun Pratap</small>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</footer>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /ViewRagisterRecordAdmin.jsp(61,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/ViewRagisterRecordAdmin.jsp(61,6) '${sessionScope.li}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${sessionScope.li}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /ViewRagisterRecordAdmin.jsp(61,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("l");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.regNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.role.rname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.stationname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.fname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.lname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.city}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.mobileno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td><a href=\"RagisterRecordUpdateServlate?regNo=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.regNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">update</a></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td><a href=\"RagisterRecordDeleteServlate?regNo=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.regNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">delete</a></td>\r\n");
          out.write("\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}

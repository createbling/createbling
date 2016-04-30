package org.apache.jsp.WEB_002dINF.views.modules.cms.frontIndex;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class comparison_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_2;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getAdminPath", com.createbling.common.config.Global.class, "getAdminPath", new Class[] {});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getFrontPath", com.createbling.common.config.Global.class, "getFrontPath", new Class[] {});
  _jspx_fnmap_2= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getUser", com.createbling.modules.sys.utils.UserUtils.class, "getUser", new Class[] {});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/views/include/taglib.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_hasPermission_name;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_hasPermission_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_shiro_hasPermission_name.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_set_2(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_set_3(_jspx_page_context))
        return;
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html class=\"cufon-active cufon-ready\"\r\n");
      out.write("\txmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>对比分析</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/favicao.ico\" type=\"image/x-icon\"\r\n");
      out.write("\trel=\"shortcut icon\" />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/comparison.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--背景图片，兼容IE-->\r\n");
      out.write("\t<img class=\"bgimg\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/bodybg.png\" />\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"main\">\r\n");
      out.write("\t\t<!--头部-->\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"header_resize\">\r\n");
      out.write("\t\t\t\t<!--logo，标题-->\r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t<div class=\"logoimg\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/logo.png\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"logoname\">\r\n");
      out.write("\t\t\t\t\t\t<h2>精细农业实时监控平台</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--导航条-->\r\n");
      out.write("\t\t\t\t<div class=\"menu_nav\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">首页</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/warning.htm\">报警</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/comparison.htm\">对比分析</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/forecast.htm\">预测</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/program.htm\">智能方案</a></li>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_shiro_hasPermission_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--header_resize end-->\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--header end-->\r\n");
      out.write("\t\t<!--头部 结束-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--主体-->\r\n");
      out.write("\t\t<div class=\"content\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"content_top\">\r\n");
      out.write("\t\t\t\t<!--日期时间-->\r\n");
      out.write("\t\t\t\t<div class=\"time\" id=\"time\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li id=\"time_1\" class=\"calendar\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li id=\"time_2\" class=\"calendar\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li id=\"time_3\" class=\"calendar\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"calendar\"><iframe style=\"margin-top: -5px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"180\" scrolling=\"no\" height=\"20\" frameborder=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\tallowtransparency=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"http://i.tianqi.com/index.php?c=code&id=1&color=%23cccccc&bdc=%23&icon=1&py=nanning&wind=0&num=1\"></iframe></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--用户信息-->\r\n");
      out.write("\t\t\t\t<div class=\"user\">\r\n");
      out.write("\t\t\t\t\t<div class=\"user_name\">\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/logout\">退出</a>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"user_name\">\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tHello! <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fns:getUser().name}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"user_portrait\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/user_portrait.jpg\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--content_top end-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"content_main\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"cbp_tmtimeline\">\r\n");
      out.write("\t\t\t\t\t<li><time class=\"cbp_tmtime\" datetime=\"2013-04-10 18:30\">\r\n");
      out.write("\t\t\t\t\t\t<span> 专家提醒您：</span> <span>杏鲍菇和凤尾菇可统一管理</span></time>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"cbp_tmicon cbp_tmicon-phone\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"cbp_tmlabel\" id=\"high1\"></div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><time class=\"cbp_tmtime\" datetime=\"2013-04-11T12:04\">\r\n");
      out.write("\t\t\t\t\t\t<span> 专家提醒您：</span> <span>杏鲍菇和凤尾菇可统一管理</span></time>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"cbp_tmicon cbp_tmicon-screen\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"cbp_tmlabel\" id=\"high2\"></div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><time class=\"cbp_tmtime\" datetime=\"2013-04-13 05:36\">\r\n");
      out.write("\t\t\t\t\t\t<span> 专家提醒您：</span> <span>杏鲍菇和凤尾菇可统一管理</span></time>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"cbp_tmicon cbp_tmicon-mail\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"cbp_tmlabel\" id=\"high3\"></div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><time class=\"cbp_tmtime\" datetime=\"2013-04-15 13:15\">\r\n");
      out.write("\t\t\t\t\t\t<span> 专家提醒您：</span> <span>杏鲍菇和凤尾菇可统一管理</span></time>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"cbp_tmicon cbp_tmicon-phone\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"cbp_tmlabel\"></div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--content_main end-->\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--content end-->\r\n");
      out.write("\t\t<!--主体 结束-->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"clr\"></div>\r\n");
      out.write("\t\t<!--尾部-->\r\n");
      out.write("\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t<div class=\"footer_resize\">\r\n");
      out.write("\t\t\t\t<p>© 版权所有 广西大学精细农业研究室</p>\r\n");
      out.write("\t\t\t\t<div class=\"clr\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--尾部 结束-->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--main end-->\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/date.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/modernizr.custom.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/highcharts.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("  $(function () {\r\n");
      out.write("    $('#high1').highcharts({\r\n");
      out.write("        title: {\r\n");
      out.write("            text: 'Monthly Average Temperature',\r\n");
      out.write("            x: -20 //center\r\n");
      out.write("        },\r\n");
      out.write("        subtitle: {\r\n");
      out.write("            text: 'Source: WorldClimate.com',\r\n");
      out.write("            x: -20\r\n");
      out.write("        },\r\n");
      out.write("        xAxis: {\r\n");
      out.write("            categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',\r\n");
      out.write("                'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']\r\n");
      out.write("        },\r\n");
      out.write("        yAxis: {\r\n");
      out.write("            title: {\r\n");
      out.write("                text: 'Temperature (°C)'\r\n");
      out.write("            },\r\n");
      out.write("            plotLines: [{\r\n");
      out.write("                value: 0,\r\n");
      out.write("                width: 1,\r\n");
      out.write("                color: '#808080'\r\n");
      out.write("            }]\r\n");
      out.write("        },\r\n");
      out.write("        tooltip: {\r\n");
      out.write("            valueSuffix: '°C'\r\n");
      out.write("        },\r\n");
      out.write("        legend: {\r\n");
      out.write("            layout: 'vertical',\r\n");
      out.write("            align: 'right',\r\n");
      out.write("            verticalAlign: 'middle',\r\n");
      out.write("            borderWidth: 0\r\n");
      out.write("        },\r\n");
      out.write("        series: [{\r\n");
      out.write("            name: 'Tokyo',\r\n");
      out.write("            data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6]\r\n");
      out.write("        }, {\r\n");
      out.write("            name: 'New York',\r\n");
      out.write("            data: [-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5]\r\n");
      out.write("        }, {\r\n");
      out.write("            name: 'Berlin',\r\n");
      out.write("            data: [-0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0]\r\n");
      out.write("        }, {\r\n");
      out.write("            name: 'London',\r\n");
      out.write("            data: [3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8]\r\n");
      out.write("        }]\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("$('#high2').highcharts({\r\n");
      out.write("        title: {\r\n");
      out.write("            text: 'Monthly Average Temperature',\r\n");
      out.write("            x: -20 //center\r\n");
      out.write("        },\r\n");
      out.write("        subtitle: {\r\n");
      out.write("            text: 'Source: WorldClimate.com',\r\n");
      out.write("            x: -20\r\n");
      out.write("        },\r\n");
      out.write("        xAxis: {\r\n");
      out.write("            categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',\r\n");
      out.write("                'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']\r\n");
      out.write("        },\r\n");
      out.write("        yAxis: {\r\n");
      out.write("            title: {\r\n");
      out.write("                text: 'Temperature (°C)'\r\n");
      out.write("            },\r\n");
      out.write("            plotLines: [{\r\n");
      out.write("                value: 0,\r\n");
      out.write("                width: 1,\r\n");
      out.write("                color: '#808080'\r\n");
      out.write("            }]\r\n");
      out.write("        },\r\n");
      out.write("        tooltip: {\r\n");
      out.write("            valueSuffix: '°C'\r\n");
      out.write("        },\r\n");
      out.write("        legend: {\r\n");
      out.write("            layout: 'vertical',\r\n");
      out.write("            align: 'right',\r\n");
      out.write("            verticalAlign: 'middle',\r\n");
      out.write("            borderWidth: 0\r\n");
      out.write("        },\r\n");
      out.write("        series: [{\r\n");
      out.write("            name: 'Tokyo',\r\n");
      out.write("            data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6]\r\n");
      out.write("        }, {\r\n");
      out.write("            name: 'New York',\r\n");
      out.write("            data: [-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5]\r\n");
      out.write("        }, {\r\n");
      out.write("            name: 'Berlin',\r\n");
      out.write("            data: [-0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0]\r\n");
      out.write("        }, {\r\n");
      out.write("            name: 'London',\r\n");
      out.write("            data: [3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8]\r\n");
      out.write("        }]\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("$('#high3').highcharts({\r\n");
      out.write("        title: {\r\n");
      out.write("            text: 'Monthly Average Temperature',\r\n");
      out.write("            x: -20 //center\r\n");
      out.write("        },\r\n");
      out.write("        subtitle: {\r\n");
      out.write("            text: 'Source: WorldClimate.com',\r\n");
      out.write("            x: -20\r\n");
      out.write("        },\r\n");
      out.write("        xAxis: {\r\n");
      out.write("            categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',\r\n");
      out.write("                'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']\r\n");
      out.write("        },\r\n");
      out.write("        yAxis: {\r\n");
      out.write("            title: {\r\n");
      out.write("                text: 'Temperature (°C)'\r\n");
      out.write("            },\r\n");
      out.write("            plotLines: [{\r\n");
      out.write("                value: 0,\r\n");
      out.write("                width: 1,\r\n");
      out.write("                color: '#808080'\r\n");
      out.write("            }]\r\n");
      out.write("        },\r\n");
      out.write("        tooltip: {\r\n");
      out.write("            valueSuffix: '°C'\r\n");
      out.write("        },\r\n");
      out.write("        legend: {\r\n");
      out.write("            layout: 'vertical',\r\n");
      out.write("            align: 'right',\r\n");
      out.write("            verticalAlign: 'middle',\r\n");
      out.write("            borderWidth: 0\r\n");
      out.write("        },\r\n");
      out.write("        series: [{\r\n");
      out.write("            name: 'Tokyo',\r\n");
      out.write("            data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6]\r\n");
      out.write("        }, {\r\n");
      out.write("            name: 'New York',\r\n");
      out.write("            data: [-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5]\r\n");
      out.write("        }, {\r\n");
      out.write("            name: 'Berlin',\r\n");
      out.write("            data: [-0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0]\r\n");
      out.write("        }, {\r\n");
      out.write("            name: 'London',\r\n");
      out.write("            data: [3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8]\r\n");
      out.write("        }]\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("ctx");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}${fns:getAdminPath()}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("ctxStatic");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}/static", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent(null);
    _jspx_th_c_set_2.setVar("cmsStatic");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}/static/modules/cms/frontIndex", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_set_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent(null);
    _jspx_th_c_set_3.setVar("frx");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}${fns:getFrontPath()}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_1));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_shiro_hasPermission_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_0 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_hasPermission_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasPermission_0.setParent(null);
    _jspx_th_shiro_hasPermission_0.setName("admin");
    int _jspx_eval_shiro_hasPermission_0 = _jspx_th_shiro_hasPermission_0.doStartTag();
    if (_jspx_eval_shiro_hasPermission_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">后台登陆</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_shiro_hasPermission_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasPermission_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_0);
      return true;
    }
    _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_0);
    return false;
  }
}

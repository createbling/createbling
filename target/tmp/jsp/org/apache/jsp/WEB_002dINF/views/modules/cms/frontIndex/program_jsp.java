package org.apache.jsp.WEB_002dINF.views.modules.cms.frontIndex;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class program_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>智能方案</title>\r\n");
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
      out.write("/css/pro.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/iconfont.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\">\r\n");
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
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/comparison.htm\">对比分析</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/forecast.htm\">预测</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"");
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
      out.write("\t\t\t\t\t\t\t\twidth=\"160\" scrolling=\"no\" height=\"20\" frameborder=\"0\"\r\n");
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
      out.write("\t\t\t<!--主体内容区-->\r\n");
      out.write("\t\t\t<div class=\"content_main\">\r\n");
      out.write("\t\t\t\t<div class=\"program\">\r\n");
      out.write("\t\t\t\t\t<div class=\"pro_title\">\r\n");
      out.write("\t\t\t\t\t\t<h2>选择参数生成智能方案</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"pro_con\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"pro_input\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pro_top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>选择方案条件</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inputbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"inputbox_left\">选择作物:</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"inputbox_right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"nice-select\" name=\"nice-select\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"crop\" id=\"input\" type=\"text\" value=\"==选择作物==\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\treadonly />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li data-value=\"1\">杏鲍菇</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li data-value=\"2\">猴头菇</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li data-value=\"3\">巴西蘑菇</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li data-value=\"4\">凤尾菇</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inputbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"inputbox_left\">种植数量:</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"inputbox_right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"nice-select\" name=\"nice-select\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"num\" type=\"text\" value=\"==选择数量范围==\" readonly />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li data-value=\"1\">0~500</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li data-value=\"2\">500~1000</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li data-value=\"3\">1000~1500</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li data-value=\"4\">1500~2000</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inputbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"inputbox_left\">种植基地:</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"inputbox_right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"nice-select\" name=\"nice-select\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"area\" type=\"text\" value=\"==选择基地==\" readonly />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li data-value=\"1\">伊岭岩一号基地</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li data-value=\"2\">伊岭岩二号基地</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li data-value=\"3\">伊岭岩三号基地</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li data-value=\"4\">伊岭岩四号基地</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inputbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"inputbox_left\">预算费用:</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"inputbox_right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"nice-select\" name=\"nice-select\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"money\" type=\"text\" value=\"==选择预算范围==\" readonly />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li data-value=\"1\">500~1000元</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li data-value=\"2\">1000~1500元</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li data-value=\"3\">1500~2000元</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li data-value=\"4\">2500~3000元</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:void(0);\" class=\"submit\" id=\"submit\">提交</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!--pro_input end-->\r\n");
      out.write("\t\t\t\t\t\t<!--\r\n");
      out.write("            <div class=\"pro_middle\">\r\n");
      out.write("              <div class=\"pro_top\" style=\"margin-bottom:10px;\"></div>\r\n");
      out.write("              <div class=\"cut\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("-->\r\n");
      out.write("\t\t\t\t\t\t<!--右侧智能方案-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"pro_result\">\r\n");
      out.write("\t\t\t\t\t\t\t<!--\r\n");
      out.write("              <div class=\"pro_top\" style=\"margin-bottom:0\">\r\n");
      out.write("                <p>生成智能方案</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            -->\r\n");
      out.write("\t\t\t\t\t\t\t<!--<div class=\"meg\">请在左侧填写条件生成智能方案</div>-->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"result_box pink\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"b_pink\">温度设置</span><span class=\"close\">×</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"package\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"val_icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"iconfont\">&#xe609;</i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"val\">24</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"val_unit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>/°C</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"placeholder\">选择参数生成方案</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"result_box cray\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"b_cray\">土壤PH值设置</span><span class=\"close\">×</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"package\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"val_icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"iconfont\">&#xe629;</i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"val\">7.5</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"val_unit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>/ph</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"placeholder\">选择参数生成方案</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"result_box pink nth\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"b_pink\">湿度设置</span><span class=\"close\">×</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"package\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"val_icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"iconfont\">&#xe6bb;</i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"val 45b0b5\">72</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"val_unit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>%</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"placeholder\">选择参数生成方案</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"result_box yellow\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"b_yellow\">CO2浓度设置</span><span class=\"close\">×</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"package\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"val_icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"iconfont\">&#xe8c2;</i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"val\">640</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"val_unit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>/ppm</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"placeholder\">选择参数生成方案</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"result_box pink\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"b_pink\">种植密度</span><span class=\"close\">×</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"package\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"val_icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"iconfont\">&#xe610;</i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"val\">10</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"val_unit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>棵/㎡</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"placeholder\">选择参数生成方案</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"result_box blue nth\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"b_blue\">布局情况</span><span class=\"close\">×</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"package\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"val_icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"iconfont\">&#xe618;</i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"val\">45</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"val_unit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>/㎡</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"placeholder\">选择参数生成方案</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!--pro_result end-->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--pro_con end-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--content_main end-->\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--content end-->\r\n");
      out.write("\t<!--主体 结束-->\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"clr\"></div>\r\n");
      out.write("\t<!--尾部-->\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("\t\t<div class=\"footer_resize\">\r\n");
      out.write("\t\t\t<p>© 版权所有 广西大学精细农业研究室</p>\r\n");
      out.write("\t\t\t<div class=\"clr\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--尾部 结束-->\r\n");
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
      out.write("\t<!--下拉框-->\r\n");
      out.write("\t<script>  \r\n");
      out.write("$('[name=\"nice-select\"]').click(function(e){\r\n");
      out.write("  $('[name=\"nice-select\"]').find('ul').hide();\r\n");
      out.write("  $(this).find('ul').show();\r\n");
      out.write("  e.stopPropagation();\r\n");
      out.write("});\r\n");
      out.write("$('[name=\"nice-select\"] li').hover(function(e){\r\n");
      out.write("  $(this).toggleClass('on');\r\n");
      out.write("  e.stopPropagation();\r\n");
      out.write("});\r\n");
      out.write("$('[name=\"nice-select\"] li').click(function(e){\r\n");
      out.write("  var val = $(this).text();\r\n");
      out.write("  var dataVal = $(this).attr(\"data-value\");\r\n");
      out.write("  $(this).parents('[name=\"nice-select\"]').find('input').val(val);\r\n");
      out.write("  $('[name=\"nice-select\"] ul').hide();\r\n");
      out.write("  e.stopPropagation();\r\n");
      out.write("  //alert($(this).parents('[name=\"nice-select\"]').find('input').val());\r\n");
      out.write("});\r\n");
      out.write("$(document).click(function(){\r\n");
      out.write("  $('[name=\"nice-select\"] ul').hide();\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("  var submit=$('#submit');\r\n");
      out.write("  submit.click(function(){\r\n");
      out.write("     Submit();\r\n");
      out.write("  })\r\n");
      out.write("  function Submit(){\r\n");
      out.write("   var crop=$(\"input[name='crop']\");\r\n");
      out.write("   var num=$(\"input[name='num']\");\r\n");
      out.write("   var area=$(\"input[name='area']\");\r\n");
      out.write("   var money=$(\"input[name='money']\");\r\n");
      out.write("   if (crop.val()==\"==选择作物==\") {alert(\"请选择作物\");return false;};\r\n");
      out.write("   if (num.val()==\"==选择数量范围==\") {alert(\"请选择数量\");return false;};\r\n");
      out.write("   if (area.val()==\"==选择基地==\") {alert(\"请选择基地\");return false;};\r\n");
      out.write("   if (money.val()==\"==选择预算范围==\") {alert(\"请选择预算范围\");return false;};\r\n");
      out.write("   $('.package').fadeIn(1000);\r\n");
      out.write("   \r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("  $(function(){\r\n");
      out.write("    var input=$(\"input\");\r\n");
      out.write("    input.change(function(){\r\n");
      out.write("      alert(\"en\");\r\n");
      out.write("    })\r\n");
      out.write("  })\r\n");
      out.write("</script>\r\n");
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

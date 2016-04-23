package org.apache.jsp.WEB_002dINF.views.modules.sys;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

public final class sysLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getAdminPath", com.createbling.common.config.Global.class, "getAdminPath", new Class[] {});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(5);
    _jspx_dependants.add("/WEB-INF/views/include/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/tlds/shiros.tld");
    _jspx_dependants.add("/WEB-INF/tlds/fns.tld");
    _jspx_dependants.add("/WEB-INF/tlds/fnc.tld");
    _jspx_dependants.add("/WEB-INF/tags/sys/validateCode.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>分布式精细农业监测系统</title>\n");
      out.write("<style type=\"text/css\">@charset \"utf-8\";\n");
      out.write("html,body{margin:0;padding:0;width:100%;}\n");
      out.write("body{font-size:12px;font-family: \"微软雅黑\";color:#333;line-height:160%;background: url(images/login-bg.jpg) center top repeat-x #FFF;height:100%;}\n");
      out.write("p,ul,.name,.pwd,dd,h1,h2,h3,form,input,select,textarea{margin:0;padding:0;border:0;font-family:\"微软雅黑\";line-height:150%;}\n");
      out.write("ul,li{list-style:none;}\n");
      out.write("div,p{word-wrap: break-word;}\n");
      out.write("img{border: none;}\n");
      out.write("input,button,select,textarea{outline:none}\n");
      out.write("\n");
      out.write("/*login*/\n");
      out.write(".login{padding:1px 0 0 0;background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/login-bg.jpg) center top no-repeat #FFF;padding:150px 0 0 0;}\n");
      out.write(".login input.submit{border:none;font-weight:bold;color:#FFF;margin:25px 0 0 150px;-webkit-border-radius:3px;-moz-border-radius:3px;border-radius:3px;-webkit-box-shadow: #CCC 0px 0px 5px;-moz-box-shadow: #CCC 0px 0px 5px;box-shadow: #CCC 0px 0px 5px;background: #31b6e7;cursor: pointer;}\n");
      out.write(".login input.submit:hover{background:#ff9229;}\n");
      out.write(".login input.submit{padding:6px 20px;}\n");
      out.write(".login .box{position:relative;z-index:100;margin:0 auto;width:700px;height:320px;background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/login.png) center top no-repeat;}\n");
      out.write(".login .log{position:relative;width:370px;height:260px;margin:0 auto;padding:90px 0 0 20px;}\n");
      out.write(".login .logo{height:85px;position:absolute;top:15px;left:180px;background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/logo-login.png) no-repeat;width:350px;height:50px;}\n");
      out.write(".login label{display:inline-block;width:70px;text-align:right;padding-right:20px;vertical-align:middle;}\n");
      out.write(".login .name{padding:10px 5px;font-size:14px;}\n");
      out.write(".login .pwd{padding:10px 5px;font-size:14px;}\n");
      out.write(".login .alt{position:absolute;top:43px;left:260px;font-size:20px;}\n");
      out.write(".login .text{filter:alpha(opacity=80);-moz-opacity:0.8;opacity:0.8;}\n");
      out.write(".login .copyright{position:absolute;left:0;width:100%;bottom:-40px;text-align:center;color:#AAA;}\n");
      out.write(".login .air-balloon{position:absolute;top:-100px;left:-100px;z-index:50;}\n");
      out.write(".login .air-balloon.ab-1{width:43px;height:78px;background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/air-balloon-1.png) no-repeat;}\n");
      out.write(".login .air-balloon.ab-2{width:24px;height:31px;background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/air-balloon-2.png) no-repeat;}\n");
      out.write(".login .footer{position: fixed;left:0;bottom:0;z-index:-1;width:100%;height:198px;background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/login-foot.jpg) center bottom repeat-x;}\n");
      out.write(".text{border:1px solid #CCC;padding:5px;background-color:#FCFCFC;line-height:14px;width:220px;font-size:12px;-webkit-border-radius:4px;-moz-border-radius:4px;border-radius:4px;-webkit-box-shadow: #CCC 0px 0px 5px;-moz-box-shadow: #CCC 0px 0px 5px;box-shadow: #CCC 0px 0px 5px;border:1px solid #CCC;font-size:12px;}\n");
      out.write(".text:focus{border:1px solid #31b6e7;background-color:#FFF;-webkit-box-shadow: #CCC 0px 0px 5px;-moz-box-shadow: #CCC 0px 0px 5px;box-shadow: #0178a4 0px 0px 5px;}\n");
      out.write(".text:hover{background-color:#FFF;}</style>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\t$(\"#loginForm\").validate({\n");
      out.write("\t\t\t\trules: {\n");
      out.write("\t\t\t\t\tvalidateCode: {remote: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/servlet/validateCodeServlet\"}\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tmessages: {\n");
      out.write("\t\t\t\t\tusername: {required: \"请填写用户名.\"},password: {required: \"请填写密码.\"},\n");
      out.write("\t\t\t\t\tvalidateCode: {remote: \"验证码不正确.\", required: \"请填写验证码.\"}\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\terrorLabelContainer: \"#messageBox\",\n");
      out.write("\t\t\t\terrorPlacement: function(error, element) {\n");
      out.write("\t\t\t\t\terror.appendTo($(\"#loginError\").parent());\n");
      out.write("\t\t\t\t} \n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$(window).resize();\n");
      out.write("\t\t});\n");
      out.write("\t\t// 如果在框架或在对话框中，则弹出提示并跳转到首页\n");
      out.write("\t\tif(self.frameElement && self.frameElement.tagName == \"IFRAME\" || $('#left').length > 0 || $('.jbox').length > 0){\n");
      out.write("\t\t\talert('未登录或登录超时。请重新登录，谢谢！');\n");
      out.write("\t\t\ttop.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("\t\t}\n");
      out.write("\t\t$(window).resize(function(){\n");
      out.write("\t\t\t$('body').height($(window).height());\n");
      out.write("\t\t\tvar top = $('body').height() / 2 - $('.form-signin').height() / 2 - 39;\n");
      out.write("\t\t\tvar left = $('body').width() / 2 - $('.form-signin').width() / 2 - 14;\n");
      out.write("\t\t\t$('.form-signin').css({'top':top,'left':left});\n");
      out.write("\t\t\t$('.footer').css({'top':top+250,'left':left+30});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!--[if lte IE 6]><br/><div class='alert alert-block' style=\"text-align:left;padding-bottom:10px;\"><a class=\"close\" data-dismiss=\"alert\">x</a><h4>温馨提示：</h4><p>你使用的浏览器版本过低。为了获得更好的浏览体验，我们强烈建议您 <a href=\"http://browsehappy.com\" target=\"_blank\">升级</a> 到最新版本的IE浏览器，或者使用较新版本的 Chrome、Firefox、Safari 等。</p></div><![endif]-->\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t<div id=\"messageBox\" class=\"alert alert-error ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty message ? 'hide' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><button data-dismiss=\"alert\" class=\"close\">×</button>\n");
      out.write("\t\t\t<label id=\"loginError\" class=\"error\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("<div class=\"login\">\n");
      out.write("    <div class=\"box png\">\n");
      out.write("\t\t<div class=\"logo png\"></div>\n");
      out.write("\t\t<div class=\"input\">\n");
      out.write("\t\t\t<div class=\"log\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<form id=\"loginForm\" class=\"form-signin\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/login\" method=\"post\">\n");
      out.write("\t\t\t\t<div class=\"name\">\n");
      out.write("\t\t\t\t\t<label class=\"input-label\" for=\"username\">用户名</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"text\" id=\"username\" name=\"username\" placeholder=\"用户名\" tabindex=\"1\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"pwd\">\n");
      out.write("\t\t\t\t\t<label class=\"input-label\" for=\"password\">密　码</label>\n");
      out.write("\t\t\t\t\t<input type=\"password\" class=\"text\" id=\"password\" name=\"password\" placeholder=\"密码\" tabindex=\"2\">\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t<input type=\"submit\" class=\"submit\" tabindex=\"3\" value=\"登录\"/>\n");
      out.write("\t\t\t\t\t<label for=\"rememberMe\" title=\"下次不需要再登录\">\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" id=\"rememberMe\" name=\"rememberMe\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rememberMe ? 'checked' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/> 记住我</label>\n");
      out.write("\t\t\t\t\t<div class=\"check\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t<div class=\"tip\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"air-balloon ab-1 png\"></div>\n");
      out.write("\t<div class=\"air-balloon ab-2 png\"></div>\n");
      out.write("    <div class=\"footer\"></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/jQuery.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/fun.base.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/script.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/flash/zoom.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<div style=\"text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';\">\n");
      out.write("\n");
      out.write("<p>©版权所有：CreateBling团队</p>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isValidateCodeLogin}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<div class=\"validateCode\">\n");
        out.write("\t\t\t<label class=\"input-label mid\" for=\"validateCode\">验证码</label>\n");
        out.write("\t\t\t");
        if (_jspx_meth_sys_validateCode_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t</div>");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_sys_validateCode_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sys:validateCode
    org.apache.jsp.tag.web.sys.validateCode_tag _jspx_th_sys_validateCode_0 = new org.apache.jsp.tag.web.sys.validateCode_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_sys_validateCode_0      );
    }
    _jspx_th_sys_validateCode_0.setJspContext(_jspx_page_context);
    _jspx_th_sys_validateCode_0.setParent(_jspx_th_c_if_0);
    _jspx_th_sys_validateCode_0.setName("validateCode");
    _jspx_th_sys_validateCode_0.setInputCssStyle("margin-bottom:0;");
    _jspx_th_sys_validateCode_0.doTag();
    return false;
  }
}

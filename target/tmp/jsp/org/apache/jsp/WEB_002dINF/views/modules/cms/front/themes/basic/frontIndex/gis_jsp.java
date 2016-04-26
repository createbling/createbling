package org.apache.jsp.WEB_002dINF.views.modules.cms.front.themes.basic.frontIndex;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class gis_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\" />\r\n");
      out.write("<!-- <style type=\"text/css\">@import url(/web/css/gis.css)</style> -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${web}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/gis.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://api.map.baidu.com/api?v=2.0&ak=90pIG6bfMS6vGipBc8m7lukE\">\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<title>菌类大棚实时监控平台</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("         <div class=\"logo\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${web}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/logo.png\" width=\"40px\" height=\"40px\"></div><h1 class=\"title\">精细农业实时监控平台</h1>\r\n");
      out.write("                  <div class=\"login\">\r\n");
      out.write("    \t     <div class=\"denglu\"><a>点击地图登录</a></div>\r\n");
      out.write("         </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<div id=\"allmap\"></div>\r\n");
      out.write("\t\r\n");
      out.write("<script type=\"text/javascript\"> ");
      out.write("\r\n");
      out.write("\twindow.onload=function(){\r\n");
      out.write("\t\tvar map=document.getElementById('allmap');\r\n");
      out.write("\t\tvar celientheight=document.documentElement.clientHeight;\r\n");
      out.write("\t\tvar h=map.offsetHeight;");
      out.write("\r\n");
      out.write("         map.style.height=celientheight-80+'px';\r\n");
      out.write("\t}\r\n");
      out.write("  </script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\tvar map = new BMap.Map(\"allmap\");\r\n");
      out.write("\tvar point = new BMap.Point(108.303999,22.890883);\r\n");
      out.write("\tmap.centerAndZoom(point,12);\r\n");
      out.write("\t\r\n");
      out.write("\tfunction addMarker(point,text){\r\n");
      out.write("\t  //var te = text;\r\n");
      out.write("\t  var marker = new BMap.Marker(point);\r\n");
      out.write("\t  marker.setAnimation(BMAP_ANIMATION_BOUNCE); \r\n");
      out.write("\t  ");
      out.write("\t  \r\n");
      out.write("\t  marker.addEventListener(\"mouseover\",function(e){  \t");
      out.write("\r\n");
      out.write("\t        var infoWindow = new BMap.InfoWindow(text);  ");
      out.write("\r\n");
      out.write("\t        marker.openInfoWindow(infoWindow,point); ");
      out.write("\r\n");
      out.write("\t  });  \r\n");
      out.write("\t        marker.addEventListener(\"mouseout\",function(e){\r\n");
      out.write("\t        marker.closeInfoWindow();\t\t");
      out.write("\r\n");
      out.write("\t  });\r\n");
      out.write("\t  ");
      out.write("\r\n");
      out.write("\t  marker.addEventListener(\"click\",forward);\r\n");
      out.write("\t  map.addOverlay(marker);\r\n");
      out.write("\t}\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\tfunction forward(e,infoWindow){\r\n");
      out.write("\t  ");
      out.write("\r\n");
      out.write("\t  var p = e.target;\r\n");
      out.write("\t  ");
      out.write("\r\n");
      out.write("\t  location.href=\"/web/gisLogin.htm?lng=\"+ p.getPosition().lng + \"&lat=\" + p.getPosition().lat;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    var navigationControl = new BMap.NavigationControl({\r\n");
      out.write("    // 靠左上角位置\r\n");
      out.write("    anchor: BMAP_ANCHOR_TOP_LEFT,\r\n");
      out.write("    // LARGE类型\r\n");
      out.write("    type: BMAP_NAVIGATION_CONTROL_LARGE,\r\n");
      out.write("    // 启用显示定位\r\n");
      out.write("    enableGeolocation: true\r\n");
      out.write("    });\r\n");
      out.write("    map.addControl(navigationControl);\r\n");
      out.write("    // 添加定位控件\r\n");
      out.write("    var geolocationControl = new BMap.GeolocationControl();\r\n");
      out.write("    geolocationControl.addEventListener(\"locationSuccess\", function(e){\r\n");
      out.write("    // 定位成功事件\r\n");
      out.write("    var address = '';\r\n");
      out.write("    address += e.addressComponent.province;\r\n");
      out.write("    address += e.addressComponent.city;\r\n");
      out.write("    address += e.addressComponent.district;\r\n");
      out.write("    address += e.addressComponent.street;\r\n");
      out.write("    address += e.addressComponent.streetNumber;\r\n");
      out.write("    alert(\"当前定位地址为：\" + address);\r\n");
      out.write("    });\r\n");
      out.write("    geolocationControl.addEventListener(\"locationError\",function(e){\r\n");
      out.write("    // 定位失败事件\r\n");
      out.write("    alert(e.message);\r\n");
      out.write("    });\r\n");
      out.write("    map.addControl(geolocationControl);\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${web}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/zDrag.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${web}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/zDialog.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t  function open5(){\r\n");
      out.write("      var diag = new Dialog();\r\n");
      out.write("\t  diag.Width = 500;\r\n");
      out.write("\t  diag.Height = 420;\r\n");
      out.write("\t  diag.Title = \"登陆、注册\";\r\n");
      out.write("\t  diag.URL = \"/web/gisLogin.htm\";\r\n");
      out.write("\t  diag.okEvent=function(){};\r\n");
      out.write("\t  diag.show();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${baseDetailList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("baseDetail");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t    ");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue(new String("baseDetail.text"));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}

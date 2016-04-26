package org.apache.jsp.WEB_002dINF.views.modules.cms.frontIndex;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.createbling.modules.sys.entity.BaseDetail;

public final class gis_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
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
      out.write("<script type=\"text/javascript\" src=\"http://api.map.baidu.com/api?v=2.0&ak=90pIG6bfMS6vGipBc8m7lukE\">\r\n");
      out.write("</script>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\tbody, html,#allmap {width: 100%;height: 100%;overflow: hidden;margin:0;font-family:\"微软雅黑\";}\r\n");
      out.write("\t</style>\r\n");
      out.write("<title>菌类大棚实时监控平台</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

    List<BaseDetail> baseDetailList = (List<BaseDetail>)request.getAttribute("baseDetailList");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"allmap\"></div>\r\n");
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
      out.write("\t");
 for(int i=0;i<baseDetailList.size();i++){
      out.write("\r\n");
      out.write("    var point_");
      out.print(i);
      out.write(" = new BMap.Point(");
      out.print(baseDetailList.get(i).getLongitude() );
      out.write(' ');
      out.write(',');
      out.print(baseDetailList.get(i).getLatitude() );
      out.write(");\r\n");
      out.write("\tvar text_");
      out.print(i);
      out.write(" = '行业：");
      out.print(baseDetailList.get(i).getText());
      out.write("'+'<br />'+'地点：");
      out.print(baseDetailList.get(i).getText() );
      out.write("';\r\n");
      out.write("    addMarker(point_");
      out.print(i);
      out.write(",text_");
      out.print(i);
      out.write(");\r\n");
      out.write("    ");
 }
      out.write("\r\n");
      out.write("\t\r\n");
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
      out.write("\r\n");
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
}

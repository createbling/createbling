package org.apache.jsp.WEB_002dINF.views.modules.cms.frontIndex;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.createbling.modules.sys.entity.BaseDetail;

public final class frontIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html class=\"cufon-active cufon-ready\" xmlns=\"http://www.w3.org/1999/xhtml\"><head>\r\n");
      out.write("<title>index</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\" />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/favicao.ico\" type=\"image/x-icon\" rel=\"shortcut icon\"  />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/iconfont.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://api.map.baidu.com/getscript?v=2.0&amp;ak=90pIG6bfMS6vGipBc8m7lukE&amp;services=&amp;t=20160422121526\"></script>\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

    List<BaseDetail> baseDetailList = (List<BaseDetail>)request.getAttribute("baseDetailList");

      out.write("\r\n");
      out.write("<!--背景图片，兼容IE-->\r\n");
      out.write("<img class=\"bgimg\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/bodybg.png\" />\r\n");
      out.write("\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("<!--头部-->\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"header_resize\">\r\n");
      out.write("<!--logo，标题-->\r\n");
      out.write("      <div class=\"logo\">\r\n");
      out.write("        <div class=\"logoimg\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/logo.png\" /></div>\r\n");
      out.write("        <div class=\"logoname\"><h2>精细农业实时监控平台</h2></div>\r\n");
      out.write("      </div>\r\n");
      out.write("<!--导航条-->\r\n");
      out.write("      <div class=\"menu_nav\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">首页</a></li>\r\n");
      out.write("          <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/warning.htm\">报警</a></li>\r\n");
      out.write("          <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/comparison.htm\">对比分析</a></li>\r\n");
      out.write("          <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/forecast.htm\">预测</a></li>\r\n");
      out.write("          <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/program.htm\">智能方案</a></li>\r\n");
      out.write("          ");
      if (_jspx_meth_shiro_hasPermission_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </div><!--header_resize end-->\r\n");
      out.write("\r\n");
      out.write("  </div><!--header end-->\r\n");
      out.write("<!--头部 结束-->\r\n");
      out.write("\r\n");
      out.write("<!--主体-->\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"content_top\">\r\n");
      out.write("<!--日期时间-->    \r\n");
      out.write("      <div class=\"time\" id=\"time\" >\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li id=\"time_1\" class=\"calendar\"></li>\r\n");
      out.write("          <li id=\"time_2\" class=\"calendar\"></li>\r\n");
      out.write("          <li id=\"time_3\" class=\"calendar\"></li>\r\n");
      out.write("          <li class=\"calendar\"><iframe style=\"margin-top:-5px;\" width=\"160\" scrolling=\"no\" height=\"20\" frameborder=\"0\" allowtransparency=\"true\" src=\"http://i.tianqi.com/index.php?c=code&id=1&color=%23cccccc&bdc=%23&icon=1&py=nanning&wind=0&num=1\"></iframe></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("<!--用户信息-->\r\n");
      out.write("      <div class=\"user\">\r\n");
      out.write("        <div class=\"user_name\"><p><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/logout\">退出</a></p></div>\r\n");
      out.write("        <div class=\"user_name\"><p>Hello! <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fns:getUser().name}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
      out.write("</span></p></div>\r\n");
      out.write("        <div class=\"user_portrait\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/user_portrait.jpg\" /></div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div><!--content_top end-->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"content_main\">\r\n");
      out.write(" <!--基地简介与地图outbox-->\r\n");
      out.write("      <div class=\"outbox\">\r\n");
      out.write(" <!--基地简介-->\r\n");
      out.write("        <div class=\"introduce\">\r\n");
      out.write("<!--基地简介条smallbox-->\r\n");
      out.write("          <div class=\"smallbox\">\r\n");
      out.write("            <div class=\"intro_icon\"><i class=\"iconfont icon_base\">&#xe602;</i></div>\r\n");
      out.write("            <div class=\"intro_content\">\r\n");
      out.write("              <p class=\"p_title\"><span>基地名称</span></p>\r\n");
      out.write("              <p class=\"p_content\">广西南宁伊岭岩蘑菇种植基地</p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"smallbox\">\r\n");
      out.write("            <div class=\"intro_icon\"><i class=\"iconfont icon_base\">&#xe618;</i></div>\r\n");
      out.write("            <div class=\"intro_content\">\r\n");
      out.write("              <p class=\"p_title\"><span>作物种类</span></p>\r\n");
      out.write("              <p class=\"p_content\">大豆，高粱，水稻，蘑菇</p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"smallbox\">\r\n");
      out.write("            <div class=\"intro_icon\"><i class=\"iconfont icon_base\">&#xe721;</i></div>\r\n");
      out.write("            <div class=\"intro_content\">\r\n");
      out.write("              <p class=\"p_title\"><span>监测参数</span></p>\r\n");
      out.write("              <p class=\"p_content\">温度，湿度，CO2</p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"smallbox no-border\">\r\n");
      out.write("            <div class=\"intro_icon\"><i class=\"iconfont icon_base\">&#xe756;</i></div>\r\n");
      out.write("            <div class=\"intro_content\">\r\n");
      out.write("              <p class=\"p_title\"><span>当前时期</span></p>\r\n");
      out.write("              <p class=\"p_content\">蘑菇收货期</p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div> <!--基地简介 end-->\r\n");
      out.write("<!--地图-->\r\n");
      out.write("        <div class=\"map\" id=\"allmap\"></div>\r\n");
      out.write("      </div><!--outbox end-->\r\n");
      out.write("<!--选择作物-->\r\n");
      out.write("<!--作物选择 end-->\r\n");
      out.write("\r\n");
      out.write("<!--温度-->\r\n");
      out.write("      <div class=\"databox\">\r\n");
      out.write("         <!--温度数据监测信息-->\r\n");
      out.write("          <div class=\"data left\">\r\n");
      out.write("            <div class=\"data_top\"><p>实时温度</p></div>\r\n");
      out.write("            <div class=\"data_main\" id=\"temp\"></div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!--温度监控设备信息-->\r\n");
      out.write("          <div class=\"equipment right\">\r\n");
      out.write("            <div class=\"data_top\"><p>温度传感器电压</p></div>\r\n");
      out.write("            <div class=\"equip_main\">\r\n");
      out.write("              <!--标准值-->\r\n");
      out.write("              <div class=\"valuebox\">\r\n");
      out.write("                <p><span>电压标准值</span></p>\r\n");
      out.write("                <div class=\"value\">\r\n");
      out.write("                   <i class=\"iconfont\">&#xe601;</i>\r\n");
      out.write("                   <span>45</span>\r\n");
      out.write("                   <b>/V</b>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <!--当前值-->\r\n");
      out.write("              <div class=\"valuebox\">\r\n");
      out.write("                <p><span class=\"b_qing\">当前电压值</span></p>\r\n");
      out.write("                <div class=\"value qing\">\r\n");
      out.write("                  <i class=\"iconfont qing\">&#xe601;</i>\r\n");
      out.write("                  <span class=\"qing\" id=\"temvol\">43</span>\r\n");
      out.write("                  <b class=\"qing\">/V</b>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("<!--温度 end-->\r\n");
      out.write("\r\n");
      out.write("<!--湿度-->\r\n");
      out.write("      <div class=\"databox\">\r\n");
      out.write("         <!--湿度数据监测信息-->\r\n");
      out.write("          <div class=\"data right\">\r\n");
      out.write("            <div class=\"data_top\"><p>实时湿度</p></div>\r\n");
      out.write("            <div class=\"data_main\" id=\"humidity\"></div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!--湿度监控设备信息-->\r\n");
      out.write("          <div class=\"equipment left\">\r\n");
      out.write("            <div class=\"data_top\"><p>湿度传感器电压</p></div>\r\n");
      out.write("            <div class=\"equip_main\">\r\n");
      out.write("              <!--标准值-->\r\n");
      out.write("              <div class=\"valuebox\">\r\n");
      out.write("                <p><span>标准值</span></p>\r\n");
      out.write("                <div class=\"value\"><i class=\"iconfont\">&#xe601;</i><span>45</span><b>/V</b></div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <!--当前值-->\r\n");
      out.write("              <div class=\"valuebox\">\r\n");
      out.write("                <p><span class=\"b_qing\">当前值</span></p>\r\n");
      out.write("                <div class=\"value qing\"><i class=\"iconfont qing\">&#xe601;</i><span class=\"qing\" id=\"humvol\">43</span><b class=\"qing\">/V</b></div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("<!--湿度 end-->\r\n");
      out.write("\r\n");
      out.write("<!--CO2-->\r\n");
      out.write("      <div class=\"databox\">\r\n");
      out.write("         <!--CO2数据监测信息-->\r\n");
      out.write("          <div class=\"data left\">\r\n");
      out.write("            <div class=\"data_top\"><p>实时co2</p></div>\r\n");
      out.write("            <div class=\"data_main\" id=\"co2\"></div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!--CO2监控设备信息-->\r\n");
      out.write("          <div class=\"equipment right\">\r\n");
      out.write("            <div class=\"data_top\"><p>co2传感器电压</p></div>\r\n");
      out.write("            <div class=\"equip_main\">\r\n");
      out.write("              <!--标准值-->\r\n");
      out.write("              <div class=\"valuebox\">\r\n");
      out.write("                <p><span>标准值</span></p>\r\n");
      out.write("                <div class=\"value\"><i class=\"iconfont\">&#xe601;</i><span>45</span><b>/V</b></div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <!--当前值-->\r\n");
      out.write("              <div class=\"valuebox\">\r\n");
      out.write("                <p><span class=\"b_qing\">当前值</span></p>\r\n");
      out.write("               <div class=\"value qing\"><i class=\"iconfont qing\">&#xe601;</i><span class=\"qing\" id=\"c02vol\">43</span><b class=\"qing\">/V</b></div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("<!--CO2 end-->\r\n");
      out.write("\r\n");
      out.write("    </div><!--content_main end-->\r\n");
      out.write("\r\n");
      out.write("  </div><!--content end-->\r\n");
      out.write("<!--主体 结束-->\r\n");
      out.write("\r\n");
      out.write("  <div class=\"clr\"></div>\r\n");
      out.write("<!--尾部-->\r\n");
      out.write("  <div class=\"footer\">\r\n");
      out.write("    <div class=\"footer_resize\">\r\n");
      out.write("      <p>© 版权所有 广西大学精细农业研究室</p>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("<!--尾部 结束-->\r\n");
      out.write("</div>\r\n");
      out.write("<!--main end-->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/date.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/highcharts.js\"></script>\r\n");
      out.write("<!--图表-->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function () {\r\n");
      out.write("  $.getJSON('http://www.highcharts.com/samples/data/jsonp.php?filename=aapl-c.json&callback=?', function (data) {\r\n");
      out.write("\r\n");
      out.write("    $('#temp').highcharts({\r\n");
      out.write("            chart:{\r\n");
      out.write("              backgroundColor:'#F5F5F5'\r\n");
      out.write("            },\r\n");
      out.write("            title : {\r\n");
      out.write("                text : '节点一'\r\n");
      out.write("            },\r\n");
      out.write("            credits:{\r\n");
      out.write("                enabled:false\r\n");
      out.write("            },  \r\n");
      out.write("            yAxis: {\r\n");
      out.write("            max:Math.round(133+(133/7)),\r\n");
      out.write("            min:0,\r\n");
      out.write("            tickInterval:(133/7),\r\n");
      out.write("            title: {\r\n");
      out.write("                text: 'Temperature (°C)'\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("\r\n");
      out.write("            series : [{\r\n");
      out.write("                name : '温度',\r\n");
      out.write("                data : data,\r\n");
      out.write("                type : 'area',\r\n");
      out.write("                threshold : null,\r\n");
      out.write("                tooltip : {\r\n");
      out.write("                    valueDecimals : 2\r\n");
      out.write("                },\r\n");
      out.write("                fillColor : {\r\n");
      out.write("                    linearGradient : {\r\n");
      out.write("                        x1: 0,\r\n");
      out.write("                        y1: 0,\r\n");
      out.write("                        x2: 0,\r\n");
      out.write("                        y2: 1\r\n");
      out.write("                    },\r\n");
      out.write("                    stops : [\r\n");
      out.write("                        [0, Highcharts.getOptions().colors[0]],\r\n");
      out.write("                        [1, Highcharts.Color(Highcharts.getOptions().colors[0]).setOpacity(0).get('rgba')]\r\n");
      out.write("                    ]\r\n");
      out.write("                }\r\n");
      out.write("            }]\r\n");
      out.write(" \r\n");
      out.write("    });});});//图表1\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function () {\r\n");
      out.write("  $.getJSON('http://www.highcharts.com/samples/data/jsonp.php?filename=aapl-c.json&callback=?', function (data) {\r\n");
      out.write("\r\n");
      out.write("    $('#humidity').highcharts({\r\n");
      out.write("            chart:{\r\n");
      out.write("              backgroundColor:'#F5F5F5'\r\n");
      out.write("            },\r\n");
      out.write("            title : {\r\n");
      out.write("                text : '节点一'\r\n");
      out.write("            },\r\n");
      out.write("            credits:{\r\n");
      out.write("                enabled:false\r\n");
      out.write("            },\r\n");
      out.write("            yAxis: {\r\n");
      out.write("            max:Math.round(133+(133/7)),\r\n");
      out.write("            min:0,\r\n");
      out.write("            tickInterval:(133/7),\r\n");
      out.write("            title: {\r\n");
      out.write("                text: 'Temperature (°C)'\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("\r\n");
      out.write("            series : [{\r\n");
      out.write("                name : '温度',\r\n");
      out.write("                data : data,\r\n");
      out.write("                type : 'area',\r\n");
      out.write("                threshold : null,\r\n");
      out.write("                tooltip : {\r\n");
      out.write("                    valueDecimals : 2\r\n");
      out.write("                },\r\n");
      out.write("                fillColor : {\r\n");
      out.write("                    linearGradient : {\r\n");
      out.write("                        x1: 0,\r\n");
      out.write("                        y1: 0,\r\n");
      out.write("                        x2: 0,\r\n");
      out.write("                        y2: 1\r\n");
      out.write("                    },\r\n");
      out.write("                    stops : [\r\n");
      out.write("                        [0, Highcharts.getOptions().colors[0]],\r\n");
      out.write("                        [1, Highcharts.Color(Highcharts.getOptions().colors[0]).setOpacity(0).get('rgba')]\r\n");
      out.write("                    ]\r\n");
      out.write("                }\r\n");
      out.write("            }]\r\n");
      out.write(" \r\n");
      out.write("    });});});//图表2\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function () {\r\n");
      out.write("  $.getJSON('http://www.highcharts.com/samples/data/jsonp.php?filename=aapl-c.json&callback=?', function (data) {\r\n");
      out.write("\r\n");
      out.write("    $('#co2').highcharts({\r\n");
      out.write("            chart:{\r\n");
      out.write("              backgroundColor:'#F5F5F5'\r\n");
      out.write("            },\r\n");
      out.write("            title : {\r\n");
      out.write("                text : '节点一'\r\n");
      out.write("            },\r\n");
      out.write("            credits:{\r\n");
      out.write("                enabled:false\r\n");
      out.write("            },\r\n");
      out.write("            yAxis: {\r\n");
      out.write("            max:Math.round(133+(133/7)),\r\n");
      out.write("            min:0,\r\n");
      out.write("            tickInterval:(133/7),\r\n");
      out.write("            title: {\r\n");
      out.write("                text: 'Temperature (°C)'\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("\r\n");
      out.write("            series : [{\r\n");
      out.write("                name : '温度',\r\n");
      out.write("                data : data,\r\n");
      out.write("                type : 'area',\r\n");
      out.write("                threshold : null,\r\n");
      out.write("                tooltip : {\r\n");
      out.write("                    valueDecimals : 2\r\n");
      out.write("                },\r\n");
      out.write("                fillColor : {\r\n");
      out.write("                    linearGradient : {\r\n");
      out.write("                        x1: 0,\r\n");
      out.write("                        y1: 0,\r\n");
      out.write("                        x2: 0,\r\n");
      out.write("                        y2: 1\r\n");
      out.write("                    },\r\n");
      out.write("                    stops : [\r\n");
      out.write("                        [0, Highcharts.getOptions().colors[0]],\r\n");
      out.write("                        [1, Highcharts.Color(Highcharts.getOptions().colors[0]).setOpacity(0).get('rgba')]\r\n");
      out.write("                    ]\r\n");
      out.write("                }\r\n");
      out.write("            }]\r\n");
      out.write(" \r\n");
      out.write("    });});});//图表3\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!--地图-->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\tvar map = new BMap.Map(\"allmap\");\r\n");
      out.write("\tvar point = new BMap.Point(108.279388,23.01462);\r\n");
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
      out.write("'+'<br />'+'");
      out.print(baseDetailList.get(i).getAk() );
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
      out.write("<!--电压变化-->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  $(function(){\r\n");
      out.write("    \r\n");
      out.write("    function change(){\r\n");
      out.write("      var temvol=$('#temvol');\r\n");
      out.write("      var humvol=$('#humvol');\r\n");
      out.write("      var co2vol=$('#co2vol');\r\n");
      out.write("      var num1=Math.round(Math.random()+43);\r\n");
      out.write("      var num2=Math.round(Math.random()+43);\r\n");
      out.write("      var num3=Math.round(Math.random()+43);\r\n");
      out.write("      temvol.html(num1);\r\n");
      out.write("      humvol.html(num2);\r\n");
      out.write("      co2vol.html(num3);\r\n");
      out.write("      setTimeout(change,3000);\r\n");
      out.write("    }\r\n");
      out.write("    change();\r\n");
      out.write("  })\r\n");
      out.write("</script>\r\n");
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
        out.write("              <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">后台登陆</a></li>\r\n");
        out.write("          ");
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
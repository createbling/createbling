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

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/views/include/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/tlds/shiros.tld");
    _jspx_dependants.add("/WEB-INF/tlds/fns.tld");
    _jspx_dependants.add("/WEB-INF/tlds/fnc.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.release();
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
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_005fset_005f2(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_005fset_005f3(_jspx_page_context))
        return;
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html class=\"cufon-active cufon-ready\"\r\n");
      out.write("\txmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>index</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\" />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/favicao.ico\" type=\"image/x-icon\"\r\n");
      out.write("\trel=\"shortcut icon\" />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/iconfont.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"http://api.map.baidu.com/getscript?v=2.0&amp;ak=90pIG6bfMS6vGipBc8m7lukE&amp;services=&amp;t=20160422121526\"></script>\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

    List<BaseDetail> baseDetailList = (List<BaseDetail>)request.getAttribute("baseDetailList");

      out.write("\r\n");
      out.write("\t<!--背景图片，兼容IE-->\r\n");
      out.write("\t<img class=\"bgimg\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
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
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/logo.png\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"logoname\">\r\n");
      out.write("\t\t\t\t\t\t<h2>精细农业实时监控平台</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--导航条-->\r\n");
      out.write("\t\t\t\t<div class=\"menu_nav\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">首页</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/warning.htm\">报警</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/comparison.htm\">对比分析</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/forecast.htm\">预测</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/program.htm\">智能方案</a></li>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_shiro_005fhasPermission_005f0(_jspx_page_context))
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
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${frx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/logout\">退出</a>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"user_name\">\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tHello! <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fns:getUser().name}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2, false));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"user_portrait\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/user_portrait.jpg\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--content_top end-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"content_main\">\r\n");
      out.write("\t\t\t\t<!--基地简介与地图outbox-->\r\n");
      out.write("\t\t\t\t<div class=\"outbox\">\r\n");
      out.write("\t\t\t\t\t<!--基地简介-->\r\n");
      out.write("\t\t\t\t\t<div class=\"introduce\">\r\n");
      out.write("\t\t\t\t\t\t<!--基地简介条smallbox-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"smallbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"intro_icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"iconfont icon_base\">&#xe602;</i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"intro_content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"p_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>基地名称</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"p_content\">广西南宁伊岭岩蘑菇种植基地</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"smallbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"intro_icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"iconfont icon_base\">&#xe618;</i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"intro_content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"p_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>作物种类</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"p_content\">大豆，高粱，水稻，蘑菇</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"smallbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"intro_icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"iconfont icon_base\">&#xe721;</i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"intro_content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"p_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>监测参数</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"p_content\">温度，湿度，CO2</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"smallbox no-border\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"intro_icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"iconfont icon_base\">&#xe756;</i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"intro_content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"p_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>当前时期</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"p_content\">蘑菇收货期</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--基地简介 end-->\r\n");
      out.write("\t\t\t\t\t<!--地图-->\r\n");
      out.write("\t\t\t\t\t<div class=\"map\" id=\"allmap\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--outbox end-->\r\n");
      out.write("\t\t\t\t<!--选择作物-->\r\n");
      out.write("\t\t\t\t<!--作物选择 end-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!--温度-->\r\n");
      out.write("\t\t\t\t<div class=\"databox\">\r\n");
      out.write("\t\t\t\t\t<!--温度数据监测信息-->\r\n");
      out.write("\t\t\t\t\t<div class=\"data left\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"data_top\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>实时温度</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"data_main\" id=\"temp\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--温度监控设备信息-->\r\n");
      out.write("\t\t\t\t\t<div class=\"equipment right\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"data_top\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>温度传感器电压</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"equip_main\">\r\n");
      out.write("\t\t\t\t\t\t\t<!--标准值-->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"valuebox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>电压标准值</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"value\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"iconfont\">&#xe601;</i> <span>45</span> <b>/V</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!--当前值-->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"valuebox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"b_qing\">当前电压值</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"value qing\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"iconfont qing\">&#xe601;</i> <span class=\"qing\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"temvol\">43</span> <b class=\"qing\">/V</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--温度 end-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!--湿度-->\r\n");
      out.write("\t\t\t\t<div class=\"databox\">\r\n");
      out.write("\t\t\t\t\t<!--湿度数据监测信息-->\r\n");
      out.write("\t\t\t\t\t<div class=\"data right\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"data_top\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>实时湿度</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"data_main\" id=\"humidity\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--湿度监控设备信息-->\r\n");
      out.write("\t\t\t\t\t<div class=\"equipment left\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"data_top\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>湿度传感器电压</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"equip_main\">\r\n");
      out.write("\t\t\t\t\t\t\t<!--标准值-->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"valuebox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>标准值</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"value\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"iconfont\">&#xe601;</i><span>45</span><b>/V</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!--当前值-->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"valuebox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"b_qing\">当前值</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"value qing\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"iconfont qing\">&#xe601;</i><span class=\"qing\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"humvol\">43</span><b class=\"qing\">/V</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--湿度 end-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!--CO2-->\r\n");
      out.write("\t\t\t\t<div class=\"databox\">\r\n");
      out.write("\t\t\t\t\t<!--CO2数据监测信息-->\r\n");
      out.write("\t\t\t\t\t<div class=\"data left\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"data_top\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>实时co2</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"data_main\" id=\"co2\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--CO2监控设备信息-->\r\n");
      out.write("\t\t\t\t\t<div class=\"equipment right\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"data_top\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>co2传感器电压</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"equip_main\">\r\n");
      out.write("\t\t\t\t\t\t\t<!--标准值-->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"valuebox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>标准值</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"value\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"iconfont\">&#xe601;</i><span>45</span><b>/V</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!--当前值-->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"valuebox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"b_qing\">当前值</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"value qing\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"iconfont qing\">&#xe601;</i><span class=\"qing\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"c02vol\">43</span><b class=\"qing\">/V</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--CO2 end-->\r\n");
      out.write("\r\n");
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
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/date.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cmsStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/highcharts.js\"></script>\r\n");
      out.write("\t<!--图表-->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
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
      out.write("\t<script type=\"text/javascript\">\r\n");
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
      out.write("\t<script type=\"text/javascript\">\r\n");
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
      out.write("\t<!--地图-->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
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
      out.write('\r');
      out.write('\n');
      out.write('	');
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
      out.write("\t<!--电压变化-->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
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
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/views/include/taglib.jsp(11,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /WEB-INF/views/include/taglib.jsp(11,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}${fns:getAdminPath()}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent(null);
    // /WEB-INF/views/include/taglib.jsp(13,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("ctxStatic");
    // /WEB-INF/views/include/taglib.jsp(13,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/static", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f2.setParent(null);
    // /WEB-INF/views/include/taglib.jsp(14,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setVar("cmsStatic");
    // /WEB-INF/views/include/taglib.jsp(14,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/static/modules/cms/frontIndex", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f2 = _jspx_th_c_005fset_005f2.doStartTag();
    if (_jspx_th_c_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f3.setParent(null);
    // /WEB-INF/views/include/taglib.jsp(16,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f3.setVar("frx");
    // /WEB-INF/views/include/taglib.jsp(16,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}${fns:getFrontPath()}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_1, false));
    int _jspx_eval_c_005fset_005f3 = _jspx_th_c_005fset_005f3.doStartTag();
    if (_jspx_th_c_005fset_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
    return false;
  }

  private boolean _jspx_meth_shiro_005fhasPermission_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_005fhasPermission_005f0 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_005fhasPermission_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fhasPermission_005f0.setParent(null);
    // /WEB-INF/views/modules/cms/frontIndex/frontIndex.jsp(51,6) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fhasPermission_005f0.setName("admin");
    int _jspx_eval_shiro_005fhasPermission_005f0 = _jspx_th_shiro_005fhasPermission_005f0.doStartTag();
    if (_jspx_eval_shiro_005fhasPermission_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">后台登陆</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_shiro_005fhasPermission_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fhasPermission_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f0);
    return false;
  }
}

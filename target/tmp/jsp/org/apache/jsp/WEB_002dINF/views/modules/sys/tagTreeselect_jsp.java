package org.apache.jsp.WEB_002dINF.views.modules.sys;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tagTreeselect_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_2;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getAdminPath", com.createbling.common.config.Global.class, "getAdminPath", new Class[] {});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getFrontPath", com.createbling.common.config.Global.class, "getFrontPath", new Class[] {});
  _jspx_fnmap_2= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:indexOf", org.apache.taglibs.standard.functions.Functions.class, "indexOf", new Class[] {java.lang.String.class, java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/views/include/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/views/include/treeview.jsp");
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>数据选择</title>\n");
      out.write("<meta name=\"decorator\" content=\"blank\" />\n");
      out.write("<link\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery-ztree/3.5.12/css/zTreeStyle/zTreeStyle.min.css\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery-ztree/3.5.12/js/jquery.ztree.all-3.5.min.js\"\n");
      out.write("\ttype=\"text/javascript\"></script>");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\tvar key, lastValue = \"\", nodeList = [], type = getQueryString(\"type\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\");\n");
      out.write("\t\tvar tree, setting = {view:{selectedMulti:false,dblClickExpand:false},check:{enable:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${checked}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\",nocheckInherit:true},\n");
      out.write("\t\t\t\tasync:{enable:(type==3),url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sys/user/treeData\",autoParam:[\"id=officeId\"]},\n");
      out.write("\t\t\t\tdata:{simpleData:{enable:true}},callback:{");
      out.write("\n");
      out.write("\t\t\t\t\tonClick:function(event, treeId, treeNode){\n");
      out.write("\t\t\t\t\t\ttree.expandNode(treeNode);\n");
      out.write("\t\t\t\t\t},onCheck: function(e, treeId, treeNode){\n");
      out.write("\t\t\t\t\t\tvar nodes = tree.getCheckedNodes(true);\n");
      out.write("\t\t\t\t\t\tfor (var i=0, l=nodes.length; i<l; i++) {\n");
      out.write("\t\t\t\t\t\t\ttree.expandNode(nodes[i], true, false, false);\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t\t},onAsyncSuccess: function(event, treeId, treeNode, msg){\n");
      out.write("\t\t\t\t\t\tvar nodes = tree.getNodesByParam(\"pId\", treeNode.id, null);\n");
      out.write("\t\t\t\t\t\tfor (var i=0, l=nodes.length; i<l; i++) {\n");
      out.write("\t\t\t\t\t\t\ttry{tree.checkNode(nodes[i], treeNode.checked, true);}catch(e){}\n");
      out.write("\t\t\t\t\t\t\t//tree.selectNode(nodes[i], false);\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\tselectCheckNode();\n");
      out.write("\t\t\t\t\t},onDblClick: function(){//");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t};\n");
      out.write("\t\tfunction expandNodes(nodes) {\n");
      out.write("\t\t\tif (!nodes) return;\n");
      out.write("\t\t\tfor (var i=0, l=nodes.length; i<l; i++) {\n");
      out.write("\t\t\t\ttree.expandNode(nodes[i], true, false, false);\n");
      out.write("\t\t\t\tif (nodes[i].isParent && nodes[i].zAsync) {\n");
      out.write("\t\t\t\t\texpandNodes(nodes[i].children);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\t$.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:indexOf(url,'?')==-1?'?':'&'}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
      out.write("&extId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${extId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&isAll=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isAll}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&module=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${module}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&t=\"\n");
      out.write("\t\t\t\t\t+ new Date().getTime(), function(zNodes){\n");
      out.write("\t\t\t\t// 初始化树结构\n");
      out.write("\t\t\t\ttree = $.fn.zTree.init($(\"#tree\"), setting, zNodes);\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t// 默认展开一级节点\n");
      out.write("\t\t\t\tvar nodes = tree.getNodesByParam(\"level\", 0);\n");
      out.write("\t\t\t\tfor(var i=0; i<nodes.length; i++) {\n");
      out.write("\t\t\t\t\ttree.expandNode(nodes[i], true, false, false);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t//异步加载子节点（加载用户）\n");
      out.write("\t\t\t\tvar nodesOne = tree.getNodesByParam(\"isParent\", true);\n");
      out.write("\t\t\t\tfor(var j=0; j<nodesOne.length; j++) {\n");
      out.write("\t\t\t\t\ttree.reAsyncChildNodes(nodesOne[j],\"!refresh\",true);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tselectCheckNode();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\tkey = $(\"#key\");\n");
      out.write("\t\t\tkey.bind(\"focus\", focusKey).bind(\"blur\", blurKey).bind(\"change cut input propertychange\", searchNode);\n");
      out.write("\t\t\tkey.bind('keydown', function (e){if(e.which == 13){searchNode();}});\n");
      out.write("\t\t\tsetTimeout(\"search();\", \"300\");\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t// 默认选择节点\n");
      out.write("\t\tfunction selectCheckNode(){\n");
      out.write("\t\t\tvar ids = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${selectIds}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\".split(\",\");\n");
      out.write("\t\t\tfor(var i=0; i<ids.length; i++) {\n");
      out.write("\t\t\t\tvar node = tree.getNodeByParam(\"id\", (type==3?\"u_\":\"\")+ids[i]);\n");
      out.write("\t\t\t\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${checked}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" == \"true\"){\n");
      out.write("\t\t\t\t\ttry{tree.checkNode(node, true, true);}catch(e){}\n");
      out.write("\t\t\t\t\ttree.selectNode(node, false);\n");
      out.write("\t\t\t\t}else{\n");
      out.write("\t\t\t\t\ttree.selectNode(node, true);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t  \tfunction focusKey(e) {\n");
      out.write("\t\t\tif (key.hasClass(\"empty\")) {\n");
      out.write("\t\t\t\tkey.removeClass(\"empty\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction blurKey(e) {\n");
      out.write("\t\t\tif (key.get(0).value === \"\") {\n");
      out.write("\t\t\t\tkey.addClass(\"empty\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tsearchNode(e);\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t//搜索节点\n");
      out.write("\t\tfunction searchNode() {\n");
      out.write("\t\t\t// 取得输入的关键字的值\n");
      out.write("\t\t\tvar value = $.trim(key.get(0).value);\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t// 按名字查询\n");
      out.write("\t\t\tvar keyType = \"name\";");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t// 如果和上次一次，就退出不查了。\n");
      out.write("\t\t\tif (lastValue === value) {\n");
      out.write("\t\t\t\treturn;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t// 保存最后一次\n");
      out.write("\t\t\tlastValue = value;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar nodes = tree.getNodes();\n");
      out.write("\t\t\t// 如果要查空字串，就退出不查了。\n");
      out.write("\t\t\tif (value == \"\") {\n");
      out.write("\t\t\t\tshowAllNode(nodes);\n");
      out.write("\t\t\t\treturn;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\thideAllNode(nodes);\n");
      out.write("\t\t\tnodeList = tree.getNodesByParamFuzzy(keyType, value);\n");
      out.write("\t\t\tupdateNodes(nodeList);\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t//隐藏所有节点\n");
      out.write("\t\tfunction hideAllNode(nodes){\t\t\t\n");
      out.write("\t\t\tnodes = tree.transformToArray(nodes);\n");
      out.write("\t\t\tfor(var i=nodes.length-1; i>=0; i--) {\n");
      out.write("\t\t\t\ttree.hideNode(nodes[i]);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t//显示所有节点\n");
      out.write("\t\tfunction showAllNode(nodes){\t\t\t\n");
      out.write("\t\t\tnodes = tree.transformToArray(nodes);\n");
      out.write("\t\t\tfor(var i=nodes.length-1; i>=0; i--) {\n");
      out.write("\t\t\t\t/* if(!nodes[i].isParent){\n");
      out.write("\t\t\t\t\ttree.showNode(nodes[i]);\n");
      out.write("\t\t\t\t}else{ */\n");
      out.write("\t\t\t\t\tif(nodes[i].getParentNode()!=null){\n");
      out.write("\t\t\t\t\t\ttree.expandNode(nodes[i],false,false,false,false);\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\ttree.expandNode(nodes[i],true,true,false,false);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\ttree.showNode(nodes[i]);\n");
      out.write("\t\t\t\t\tshowAllNode(nodes[i].children);\n");
      out.write("\t\t\t\t/* } */\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t//更新节点状态\n");
      out.write("\t\tfunction updateNodes(nodeList) {\n");
      out.write("\t\t\ttree.showNodes(nodeList);\n");
      out.write("\t\t\tfor(var i=0, l=nodeList.length; i<l; i++) {\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t//展开当前节点的父节点\n");
      out.write("\t\t\t\ttree.showNode(nodeList[i].getParentNode()); \n");
      out.write("\t\t\t\t//tree.expandNode(nodeList[i].getParentNode(), true, false, false);\n");
      out.write("\t\t\t\t//显示展开符合条件节点的父节点\n");
      out.write("\t\t\t\twhile(nodeList[i].getParentNode()!=null){\n");
      out.write("\t\t\t\t\ttree.expandNode(nodeList[i].getParentNode(), true, false, false);\n");
      out.write("\t\t\t\t\tnodeList[i] = nodeList[i].getParentNode();\n");
      out.write("\t\t\t\t\ttree.showNode(nodeList[i].getParentNode());\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t//显示根节点\n");
      out.write("\t\t\t\ttree.showNode(nodeList[i].getParentNode());\n");
      out.write("\t\t\t\t//展开根节点\n");
      out.write("\t\t\t\ttree.expandNode(nodeList[i].getParentNode(), true, false, false);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t// 开始搜索\n");
      out.write("\t\tfunction search() {\n");
      out.write("\t\t\t$(\"#search\").slideToggle(200);\n");
      out.write("\t\t\t$(\"#txt\").toggle();\n");
      out.write("\t\t\t$(\"#key\").focus();\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div style=\"position: absolute; right: 8px; top: 5px; cursor: pointer;\"\n");
      out.write("\t\tonclick=\"search();\">\n");
      out.write("\t\t<i class=\"icon-search\"></i><label id=\"txt\">搜索</label>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"search\" class=\"form-search hide\"\n");
      out.write("\t\tstyle=\"padding: 10px 0 0 13px;\">\n");
      out.write("\t\t<label for=\"key\" class=\"control-label\" style=\"padding: 5px 5px 3px 0;\">关键字：</label>\n");
      out.write("\t\t<input type=\"text\" class=\"empty\" id=\"key\" name=\"key\" maxlength=\"50\"\n");
      out.write("\t\t\tstyle=\"width: 110px;\">\n");
      out.write("\t\t<button class=\"btn\" id=\"btn\" onclick=\"searchNode()\">搜索</button>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"tree\" class=\"ztree\" style=\"padding: 15px 20px;\"></div>\n");
      out.write("</body>");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!checked}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\ttop.$.jBox.getBox().find(\"button[value='ok']\").trigger(\"click\");\n");
        out.write("\t\t\t\t\t\t//$(\"input[type='text']\", top.mainFrame.document).focus();//");
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
}

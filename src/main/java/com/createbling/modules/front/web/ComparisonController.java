package com.createbling.modules.front.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 对比分析的json数据封装
 * @author SUN
 *
 */
import org.springframework.web.bind.annotation.RequestMethod;

import com.createbling.modules.front.entity.ComparisonJson;
import com.createbling.modules.sys.service.AreaService;
import com.createbling.modules.sys.service.ExpertService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping(value = "${frontPath}")
public class ComparisonController {
	@Autowired
	private ExpertService eService;
	@Autowired
	private AreaService aService;
	@RequestMapping(value = "/comparison",method={RequestMethod.GET})
	public void getJson(Model model,HttpServletRequest request,HttpServletResponse response){
		String base_id=request.getParameter("base_id"); 
		String plant_id=request.getParameter("plant_id");
		ArrayList<ComparisonJson > comparisons=new ArrayList<>();
		ObjectMapper objectMapper = new ObjectMapper();
			ComparisonJson cj=new ComparisonJson();
			ComparisonJson cj1=new ComparisonJson();
			ComparisonJson cj2=new ComparisonJson();
			ComparisonJson cj3=new ComparisonJson();
			ComparisonJson cj4=new ComparisonJson();
			ComparisonJson cj5=new ComparisonJson();
			ComparisonJson cj6=new ComparisonJson();
			ComparisonJson cj7=new ComparisonJson();
			ComparisonJson cj8=new ComparisonJson();
			ComparisonJson cj9=new ComparisonJson();
			cj.setName("杏鲍菇");
			double[] data={27.0, 26.9, 29.5, 27.5, 28.2, 28.5, 28.2, 29.5, 28.3, 28.3, 27.9, 27.6};
			cj.setData(data);
			comparisons.add(cj);
			
			cj3.setName("猴头菇");
			double[] data3={29.2, 29.8, 29.0, 29.9, 30.1, 29.9, 29.1, 29.7, 29.9, 29.7, 31.3,30.6};
			cj3.setData(data3);
			comparisons.add(cj3);
			
			cj4.setName("凤尾菇");
			double[] data4={27.3, 26.4, 29.4, 27.2, 29.2, 29.5, 28.9, 29.2, 28.7, 28.5, 28.9, 28.9};
			cj4.setData(data4);
			comparisons.add(cj4);
			///////////////
			cj5.setName("杏鲍菇");
			double[] data5={22.3, 21.5, 22.8, 22.2, 21.8, 21.3, 21.9, 22.2, 22.9, 21.9, 22.1, 22.3};
			cj5.setData(data5);
			comparisons.add(cj5);
			
			cj6.setName("猴头菇");
			double[] data6={20.3, 20.6, 18.1, 17.2, 16.2, 15.9, 16.2,16.1, 14.7, 16.9, 17.3,14.1};
			cj6.setData(data6);
			comparisons.add(cj6);
			
			cj1.setName("凤尾菇");
			double[] data1={22.0, 21.9, 22.5, 22.5, 21.2, 21.5, 21.2, 22.5, 22.3, 21.3, 22.9, 22.6};
			cj1.setData(data1);
			comparisons.add(cj1);
			
			
			/////////////////
			cj7.setName("杏鲍菇");
			double[] data7={13.3, 12.5, 12.8, 12.2, 12.1, 12.8, 13.0, 12.8, 12.2, 13.1, 12.9, 12.1};
			cj7.setData(data7);
			comparisons.add(cj7);
			
			cj2.setName("猴头菇");
			double[] data2={15.0, 16.9, 14.5, 16.5, 15.2, 18.5, 17.2, 14.5, 15.3, 16.3, 17.9, 15.6};
			cj2.setData(data2);
			comparisons.add(cj2);
			
			cj8.setName("凤尾菇");
			double[] data8={12.6, 13.4, 12.7, 12.9, 12.9, 12.8, 13.3, 12.9, 12.9, 13.4, 12.3, 13.6};
			cj8.setData(data8);
			comparisons.add(cj8);
			
			
			 try {
				 System.out.println( "直接输出字符串："+objectMapper.writeValueAsString(comparisons)); 
				 objectMapper.writeValue(response.getWriter(),comparisons);	
			}catch (JsonParseException e) {
	            // 异常时，记录日志，不中断程序
	            e.printStackTrace();
	        } catch (JsonMappingException e) {
	            // 异常时，记录日志，不中断程序
	            e.printStackTrace();
	        } catch (IOException e) {
	            // 异常时，记录日志，不中断程序
	            e.printStackTrace();
	        }	
			 
			 
	}

}

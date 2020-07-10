package Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.*;

public class TestJson {

    public static void main(String[] args) {
        /*
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("username","yaomy");
        map.put("password","123");
        JSONObject jsonObject=new JSONObject(map);//将map集合包装成一个json对象



        JSONObject json=new JSONObject();
        json.put("username1","yaomy1");
        json.put("password1","1234");
      // System.out.println(json.toJSONString());//JSONObject对象转化成JSON类型字符串



        JSONObject json1=new JSONObject();
        json1.put("username2","yaomy2");
        json1.put("password2","12345");
        Map<String,Object> map1=(Map<String,Object>)json1;//JSONObject对象转化成Map对象
        Set<String> set=map1.keySet();
        for(String s :set){
            System.out.println("key:"+s+"value:"+map1.get(s));
        }



        //拼接的json类型自字符串转化成JSONObject对象
        String str="{\"username\":\"yaomy3\",\"password\":\"123456\"}";
        JSONObject json5=JSONObject.parseObject(str);
        System.out.println(json5);
        String string="{\"name\":\"weiwei\",\"sex\":\"男\",\"age\":\"18\"}";//拼接字符串的形式
*/

        //List->json字符串
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        String liststr= JSON.toJSONString(list);

        //json->list
        System.out.println("list转jsonString"+liststr);
        List<String> list1=(List)JSON.parse(liststr);
        for(String a:list1){
            System.out.println(a);
        }


        //json->jsonArray
        JSONArray jsonArray=JSON.parseArray(liststr);
        System.out.println("jsonArray:"+jsonArray);


        //map

        Map<String,String> map=new HashMap<>();
        map.put("a","1");
        map.put("b","2");

        //map->json
        String mapstr=JSON.toJSONString(map);
        System.out.println("mapjsonString:"+mapstr);



        //json->map
        Map<String,String> map1=(Map<String,String>)JSON.parse(mapstr);
        System.out.println("json转map");
        for(Iterator<String> iterator=map1.keySet().iterator();iterator.hasNext();){
            String aa=iterator.next();
            System.out.println("map的value数值:"+map1.get(aa));
        }


        String f="[\"a\",\"b\"]";
        JSONArray jsonArray1=JSON.parseArray(f);
        System.out.println(jsonArray1);

    }
}

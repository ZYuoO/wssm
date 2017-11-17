package com.mm.utils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RequestUtils {
    /**
     * 从request中获得参数Map，并返回可读的Map
     *
     * @param request
     * @return
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static Map getParameterMap(HttpServletRequest request) {
        // 参数Map
        Map properties = request.getParameterMap();
        // 返回值Map
        Map returnMap = new HashMap();
        Iterator entries = properties.entrySet().iterator();
        Map.Entry entry;
        String name = "";
        String value = "";
        while (entries.hasNext()) {
            entry = (Map.Entry) entries.next();
            name = (String) entry.getKey();
            Object valueObj = entry.getValue();
            if(null == valueObj){
                value = "";
            }else if(valueObj instanceof String[]){
                String[] values = (String[])valueObj;
                for(int i=0;i<values.length;i++){
                    value = values[i] + ",";
                }
                value = value.substring(0, value.length()-1);
            }else{
                value = valueObj.toString();
            }
            returnMap.put(name, value);
        }
        return returnMap;
    }
    public static Map<String, Object> reutrnResult(String code, Map<String, Object> map,String message){
        Map<String, Object> resultMap = new HashMap<String, Object>();
        Map<String, Object> bodyMap = new HashMap<String, Object>();
        resultMap.put("code",code);
        resultMap.put("message",message);
        resultMap.put("total",map==null?0:map.size()>0?1:0);
        resultMap.put("content",map);
        return resultMap;
    }
    public static final String SUCCESS="0000";
    public static final String DEFEAT="9999";
}

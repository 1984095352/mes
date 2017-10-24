package cn.ssm.util;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

/**   
* @Title: MD5.java
* @Package cn.ssm.util
* @Description: MD5加密
* @author 魏亮旗   
* @date 2017-5-4 下午7:39:35
* @version V1.0   
*/
public class MD5{
	public String getPassword(String password) throws UnsupportedEncodingException
	{
		if(password==null){
			password="123456";
		}
		  MessageDigest md5= null;

		try
		{
			 md5 = MessageDigest.getInstance("MD5");
			  
             
             
		} 
		catch (Exception e) 
		{
			 e.printStackTrace();

		}
		byte[] byteArray = password.getBytes("UTF-8");
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) 
        {
      	  int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));     		
        }
        return hexValue.toString();
}	
		

	
}

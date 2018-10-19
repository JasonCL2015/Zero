package com.jason.zero.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * @Package com.jason.zero.utils
 * @author: wenyuan
 * @date: 2018/10/19 4:45 PM
 */
public class CommandUtil {




    /*该方法实现文件自动复制功能。利用系统命令将指定文件名从源路径复制到目的路径
         * 如果目的路径不存在时，自动创建目的路径
         * */
    public static boolean copyFile(String origpath, String destpath, String filename) throws Exception {
        String osName = System.getProperty("os.name");
        boolean flag = false;
        /*系统命令支持的操作系统Windows XP, 2000 2003 7*/
//        if(!(osName.equalsIgnoreCase("windows XP") || osName.equalsIgnoreCase("windows 2000") || osName.equalsIgnoreCase("windows
// 2003") || osName.equalsIgnoreCase("windows 7"))){
//            return flag;
//        }
        Runtime rt = Runtime.getRuntime();
        Process p = null;

        int exitVal;
        p = rt.exec("cmd exe /c copy " + origpath + filename + " " + destpath);
        // 进程的出口值。根据惯例，0 表示正常终止。
        exitVal = p.waitFor();
        if (exitVal == 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;

    }

    public static Object exec(String cmd) {
        try {
            String[] cmdA = {"/bin/sh", "-c", cmd};
            Process process = Runtime.getRuntime().exec(cmdA);
            LineNumberReader br = new LineNumberReader(new InputStreamReader(
                    process.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sb.append(line).append("\n");
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String exeCmd(String commandStr) {
//        String[] cmdA;
//        if (OSInfo.isLinux() || OSInfo.isMacOS() || OSInfo.isMacOSX()) {
//            cmdA = new String[]{"/bin/sh", "-c"};
//        }
//        if (OSInfo.isWindows()) {
//            cmdA = new String[]{"cmd exe", "-c"};
//        }

        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();
        try {
            Process p = Runtime.getRuntime().exec(commandStr);
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;

            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            if (br != null)
            {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

//        try {
//            copyFile("D:\\DATA\\", "D:\\a\\", "131204.txt");
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//
//        // TODO Auto-generated method stub
//        String pwdString = exec("pwd").toString();
//        String netsString = exec("netstat -nat|grep -i \"80\"|wc -l").toString();
//
//        System.out.println("==========获得值=============");
//        System.out.println(pwdString);
//        System.out.println(netsString);
//
//
        String commandStr = "ls -l";
        //String commandStr = "ipconfig";
        exeCmd(commandStr);
    }

}


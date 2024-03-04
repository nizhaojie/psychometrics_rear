package com.nzj.utils;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;

import java.io.InputStream;

public class AliOssUtil {
    // Endpoint地域节点
    private static final String ENDPOINT = "https://oss-cn-hangzhou.aliyuncs.com";
    // ACCESS_KEY_ID
    private static final String ACCESS_KEY_ID="LTAI5t8g3QDSGSdxT4NEPrVH";
    // ACCESS_KEY_SECRET
    private static final String ACCESS_KEY_SECRET="1OSzAuR4uFo683wtDrt33Jx5Fp7P4D";
    // Bucket桶名称
    private static final String BUCKET_NAME = "head-sculpture-nzj";

    public static String uploadFile(String objectName, InputStream in) throws Exception {
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(ENDPOINT,ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        String url = "";
        try {
            // 创建PutObjectRequest对象。
            PutObjectRequest putObjectRequest = new PutObjectRequest(BUCKET_NAME, objectName, in);
            // 上传字符串,执行成功则可以生成url
            PutObjectResult result = ossClient.putObject(putObjectRequest);
            //url组成: https://bucket名称.区域节点/objectName
            url = "https://"+BUCKET_NAME+"."+ENDPOINT.substring(ENDPOINT.lastIndexOf("/")+1)+"/"+objectName;
        } catch (OSSException oe) {
            System.out.println("Caught an OSSException, which means your request made it to OSS, "
                    + "but was rejected with an error response for some reason.");
            System.out.println("Error Message:" + oe.getErrorMessage());
            System.out.println("Error Code:" + oe.getErrorCode());
            System.out.println("Request ID:" + oe.getRequestId());
            System.out.println("Host ID:" + oe.getHostId());
        } catch (ClientException ce) {
            System.out.println("Caught an ClientException, which means the client encountered "
                    + "a serious internal problem while trying to communicate with OSS, "
                    + "such as not being able to access the network.");
            System.out.println("Error Message:" + ce.getMessage());
        } finally {
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }

        return url;
    }
}

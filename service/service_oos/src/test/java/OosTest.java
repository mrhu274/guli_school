import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: hhp
 * Date: 2022/6/9
 * Time: 13:56
 * Description: No Description
 */
public class OosTest {
    // Endpoint以杭州为例，其它Region请按实际情况填写。
    String endpoint = "https://oss-cn-hangzhou.aliyuncs.com";
        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。

    String accessKeyId = "LTAI5t9N5Ak2qLLNRqL6sugC";
    String accessKeySecret = "J5E6dMcs5xWP87w9IAum4xR68t7uNf";
    String bucketName = "gulifile-hhp";
    @Test
    public void testCreateBucket() {
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        // 创建存储空间。
        ossClient.createBucket(bucketName);
        // 关闭OSSClient。
        ossClient.shutdown();
    }
}

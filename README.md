# minio-demo

```
拉取到项目后，打开application.yml文件，修改下面的配置为自己的服务器
minio:
  endpoint: 
  accessKey: 
  secretKey: 
  filHost: 
```

```
打开浏览器访问http://localhost:8080/doc.html 或者http://localhost:8080/swagger-ui.html
点击上传文件接口选择上传文件即可
```

```
或者打开postman发送POST请求http://localhost:8080/file/upload

body为form-data类型，key为file,value为你选的文件
```
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
打开postman发送POST请求http://localhost:8080/file/upload

body为form-data类型，key为file,value为你选的文件
```
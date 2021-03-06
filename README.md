# Swagger Code Generator

#### Swagger Codegen to generate the API client with [Moya](https://github.com/Moya/Moya/) & [RxSwift](https://github.com/ReactiveX/RxSwift/).

## Install:
1. Install `Java JDK 7/8`
2. Install `Maven` (should install via `brew` on Mac OSX)
3. Clone this repo: [https://github.com/dangthaison91/swagger-codegen/](https://github.com/dangthaison91/swagger-codegen/)
4. Checkout branch: `swift3_moya`
5. Open Terminal then `cd` into `swagger-codegen` folder
6. Run: `mvn clean package -Dmaven.test.skip=true` to compile

## Usage
1. Open repo folder: `swagger-codegen`
2. Run `bin/swift3-petstore-moya-rxswift.sh` via Terminal


###### If you cannot execute script, please execute:

```
java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate
-t modules/swagger-codegen/src/main/resources/swift3/libraries/moya
-i modules/swagger-codegen/src/test/resources/2_0/petstore-with-fake-endpoints-models-for-testing.yaml
-l swift3-moya
-c ./bin/swift3-petstore-rxswift.json
-o samples/client/petstore/swift3/moya
```

###### Some options if you want to customize:
```
-t: Your templates
-i: Your swagger spec file yaml/json
-l: language (use swift3 to generate API using Alamofire)
-c: Custom build options using configuration file in json
-o: Output path
```

# Swagger Codegen Documents
[https://github.com/swagger-api/swagger-codegen](https://github.com/swagger-api/swagger-codegen)

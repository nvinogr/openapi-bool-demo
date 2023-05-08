# OpenApi Boolean Field's Schema Demo
Demo application reproducing the issue described [here](https://github.com/springdoc/springdoc-openapi/issues/2229).

To run, execute the command below from project's root directory: 
```bash
./gradlew clean generateOpenApiDocs
```
Then check generate documentation in [openapi.yaml](build/openapi.yaml):
```yaml
components:
  schemas:
    Response:
      type: object
      properties:
        bar:
          type: boolean
          description: Schema description (bar)
          example: true
        foo:
          type: boolean
          # description: Schema description (foo) -- missing
          # example: true                         -- missing
      description: Demo response object
```
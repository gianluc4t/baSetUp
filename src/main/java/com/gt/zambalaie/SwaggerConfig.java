package com.gt.zambalaie;

import java.io.FileInputStream;
import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.paths.RelativePathProvider;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {


  @Bean
  public Docket postsApi() {
    return new Docket(DocumentationType.SWAGGER_2).groupName("public-api").apiInfo(apiInfo())
        .select().build().pathProvider(new RelativePathProvider(null) {
          @Override
          public String getApplicationBasePath() {
              return "/zanzariera";
          }
      });
  }

  private ApiInfo apiInfo() {
    String version = "azizz";
    try {
      
      String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();

      Properties appProps = new Properties();
      appProps.load(new FileInputStream(rootPath + "application.properties"));

      version = appProps.getProperty("app.vers");
      
      System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXx " + version);
      
      Package mainPackage = App.class.getPackage();
      String version2 = mainPackage.getImplementationVersion();
      String groupId = mainPackage.getName();
      String artifactId = mainPackage.getImplementationTitle();

      System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXx " + version2);
      System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXx " + groupId);
      System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXx " + artifactId);
      
      
    } catch (Exception e) {
      e.printStackTrace();
    }

    return new ApiInfoBuilder().title("AStig apana RREA").description("tie uvulia a tavulin"+version)
        .termsOfServiceUrl("http://hantsy.blogspot.com").license("cri cri ")
        .licenseUrl("https://hantsy.com/springfox/springfox/blob/master/LICENSE").version(version)
        .build();
  }

}

package FormValidation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
 
@Configuration
@ComponentScan("FormValidation.*")
public class ApplicationContextConfig 
{
	/* This is used in validate() in CustomerInfoValidator class.Spring internally map its value like:
	   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty.customerForm.name"); */
	/*
	 * @Bean public ResourceBundleMessageSource messageSource() {
	 * ResourceBundleMessageSource rb = new ResourceBundleMessageSource();
	 * rb.setBasenames(new String[] { "messages/validator" }); //Load property in
	 * message/validator.properties
	 * 
	 * return rb; }
	 */
	
	@Bean
    public ResourceBundleMessageSource messageSource() 
    {
        ResourceBundleMessageSource rb = new ResourceBundleMessageSource();
        rb.setBasenames(new String[] { "messages/validator" }); //Load property in message/validator.properties
        
        return rb;
    }
	
    @Bean(name = "viewResolver")
    public InternalResourceViewResolver getViewResolver() 
    {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
 
}

package system;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:Reporter/reporter.html"},
        features = {"features"},  // busca a pasta features no projeto
        snippets = CucumberOptions.SnippetType.CAMELCASE,  // trás um camelCase na execução do projeto
        glue = {"steps"}


)
public class Runner {
}

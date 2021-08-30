import java.util.HashMap;
import java.util.Map;

public class trainPojo {

    private String id;
    private String correctedQuestion;
    private String intermediaryQuestion;
    private String sparqlQuery;
    private Integer sparqlTemplateId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorrectedQuestion() {
        return correctedQuestion;
    }

    public void setCorrectedQuestion(String correctedQuestion) {
        this.correctedQuestion = correctedQuestion;
    }

    public String getIntermediaryQuestion() {
        return intermediaryQuestion;
    }

    public void setIntermediaryQuestion(String intermediaryQuestion) {
        this.intermediaryQuestion = intermediaryQuestion;
    }

    public String getSparqlQuery() {
        return sparqlQuery;
    }

    public void setSparqlQuery(String sparqlQuery) {
        this.sparqlQuery = sparqlQuery;
    }

    public Integer getSparqlTemplateId() {
        return sparqlTemplateId;
    }

    public void setSparqlTemplateId(Integer sparqlTemplateId) {
        this.sparqlTemplateId = sparqlTemplateId;
    }



}

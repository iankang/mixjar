
import com.mixsteroids.mixjar.utils.Mixcloud.BASE_URL
import io.restassured.RestAssured
import io.restassured.RestAssured.get
import io.restassured.builder.RequestSpecBuilder
import io.restassured.config.LogConfig
import io.restassured.config.RestAssuredConfig
import io.restassured.filter.log.LogDetail
import io.restassured.http.ContentType
import io.restassured.module.kotlin.extensions.Given
import io.restassured.module.kotlin.extensions.Then
import io.restassured.module.kotlin.extensions.When
import io.restassured.specification.RequestSpecification
import org.junit.After
import org.junit.Before
import org.junit.Test

class MixCloudTest {

    companion object {
        lateinit var requestSpecification: RequestSpecification
    }

    @Before
    fun setup(){
        val logconfig = LogConfig.logConfig()
            .enableLoggingOfRequestAndResponseIfValidationFails(LogDetail.ALL)
        val config = RestAssuredConfig.config().logConfig(logconfig)

        requestSpecification = RequestSpecBuilder()
            .setBaseUri(BASE_URL)
            .setContentType(ContentType.JSON)
            .setRelaxedHTTPSValidation()
            .setConfig(config)
            .build()

    }

    @Test
    fun testGetUserCode_returns200(){
        setup()
        val validatableResponse = Given {
            requestSpecification
        } When {
            get("/spartacus")
        } Then {
            statusCode(200)
        }
    }


    @After
    fun tearDown(){
        RestAssured.reset()
    }
}
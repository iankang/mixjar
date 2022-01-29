
import com.mixsteroids.mixjar.utils.Mixcloud.BASE_URL
import io.restassured.RestAssured
import io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails
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



    @Test
    fun testGetUserCode_returns200(){

      When {
            get(BASE_URL+"spartacus")
        } Then {
            statusCode(200)
        }
    }

    @Test
    fun testGetMisspelledUserCode_returns404(){
        When{
            get(BASE_URL +"spartacus1")
        } Then {
            statusCode(200)
        }
    }

}
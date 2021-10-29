# mixjar
This is an unofficial [Mixcloud Developer API](https://www.mixcloud.com/developers/) wrapper developed in kotlin for 
the purpose of easily consuming the API for use in JVM environments.

#Usage

Add it in your root build.gradle at the end of repositories:

    allprojects {
        repositories {
        ...
        maven { url 'https://jitpack.io' }
        }
    }

Add the dependency

	dependencies {
	        implementation 'com.github.iankang:mixjar:1.03'
	}

### Implementation Example

    val mixCloudServiceImpl = MixCloud()
    val item =  mixCloudServiceImpl.getUser("DjChief254")
    //you can now use your fresh item object 

## Language Used:
    * Kotlin

## Libraries Used.
These are the libraries used in the development of this wrapper.
Order does not denote significance.

1. [gson](https://github.com/google/gson)
2. [okhttp](https://square.github.io/okhttp/)
3. [retrofit](https://square.github.io/retrofit/)
4. [io.rest-assured](https://rest-assured.io/)

## Caveat

This is not yet complete and is not an official MixCloud wrapper.
send your thoughts and suggestions to ianngech@gmail.com
[![Maven Central](https://img.shields.io/maven-central/v/com.github.xmlet/androidLayoutsApi.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.github.xmlet%22%20AND%20a:%22androidLayoutsApi%22)

# AndroidLayoutsApi

<div align="justify"> 
    The AndroidLayoutsApi is a Java DSL generated based on the XML Schema Definition, i.e. XSD, of the Android Layouts. 
    This means that this Java library provides a way to manipulate all the components which encompass the creation of 
    Android visual layouts. To generate this DSL we use other <i>xmlet</i> projects such as 
    <a href="https://github.com/xmlet/XsdAsmFaster">XsdAsmFaster</a> and 
    <a href="https://github.com/xmlet/XsdParser">XsdParser</a>. 
</div>

## Installation

<div align="justify"> 
    First, in order to include it to your Maven project, simply add this dependency:
    <br />
    <br />
</div>

```xml
<dependency>
    <groupId>com.github.xmlet</groupId>
    <artifactId>androidLayoutsApi</artifactId>
    <version>1.0.1</version>
</dependency>
``` 

## How does AndroidLayoutsApi works?

<div align="justify"> 
    This library is composed by a set of classes generated by <a href="https://github.com/xmlet/XsdAsmFaster">XsdAsmFaster</a>.
    These classes represent every element and attribute that are possible to be defined in the definition of Android visual layouts.
    All the classes of this DSL implement the Visitor pattern, which means that this library can be used by with any purpose,
    with the only requirement being the definition of a concrete Visitor class which implement the expected behaviour.
    As an example of a concrete behaviour we have another project, <a href="https://github.com/xmlet/AndroidLayouts">AndroidLayouts</a>, 
    which uses this DSL to write valid layouts for Android. An example of this usage can be seen in the following code.  
</div>

```java
class Example{
    void example(){
        Android android = new Android(androidObj ->
            androidObj.layout()
                .linearLayout()
                    .attrOrientation(EnumOrientationLinearLayout.VERTICAL)
                    .attrLayoutWidth("match_parent")
                    .attrLayoutHeight("wrap_content")
                    .linearLayout()
                        .attrOrientation(EnumOrientationLinearLayout.HORIZONTAL)
                        .attrLayoutWidth("match_parent")
                        .attrLayoutHeight("wrap_content")
                        .imageView()
                            .attrLayoutWidth("wrap_content")
                            .attrLayoutHeight("wrap_content").__()
                        .textView()
                            .attrWidth("match_parent")
                            .attrHeight("weight_content")
                            .attrLines("2").__()
                    .__()
                .__());

        String result = android.getLayout();
    }
}
```

<div align="justify"> 
    In this example the <a href="https://github.com/xmlet/AndroidLayouts">AndroidLayouts</a> library uses this DSL to 
    write the following layout:
</div>

```xml
<LinearLayout
	android:orientation="vertical"
	android:layout_width="match_parent"
	android:layout_height="wrap_content">
	<LinearLayout
		android:orientation="horizontal"
		android:layout_width="match_parent"
		android:layout_height="wrap_content">
		<ImageView
			android:layout_width="wrap_content"
			android:layout_height="wrap_content"/>
		<TextView
			android:width="match_parent"
			android:height="weight_content"
			android:lines="2"/>
	</LinearLayout>
</LinearLayout>
```

<div align="justify"> 
    As we can see from the previous example, this DSL provides a very similar way to write valid layouts, the flow of the
    creation of the layout being very similar to the flow of writing XML, while guaranteeing that the rules of the creation
    of Android layouts are verified.
</div>

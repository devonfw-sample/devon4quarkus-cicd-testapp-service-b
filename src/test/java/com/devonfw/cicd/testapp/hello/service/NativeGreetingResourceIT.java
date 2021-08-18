package com.devonfw.cicd.testapp.hello.service;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeGreetingResourceIT extends HelloWorldRestServiceTest {

    // Execute the same tests but in native mode.
}
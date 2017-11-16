module module.core {
    exports com.mlesniak.api;
    provides com.mlesniak.api.SimpleService with com.mlesniak.implementation.HelloWorldService;

}
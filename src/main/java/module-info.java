module jdk10.demo {
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.web;

    opens com.jdk10.example.jdk10demo to spring.core;
    opens com.jdk10.example.jdk10demo.controller to spring.beans, spring.web;

    exports com.jdk10.example.jdk10demo;
}
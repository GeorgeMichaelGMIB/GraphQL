package com.graphQL.app.service;

import com.graphQL.repository.BookRepository;
import graphql.GraphQL;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;


@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    @Value("classpath:books.graphql")
    Resource resource;

    @PostConstruct
    public void loadGGraphQL(){
        File schemaFile = shemaResource.getFile();
        TypeDefinitionRegistry definitionRegistry = new SchemaParser().parse(schemaFile);
        RuntimeWiring wiring = buildRuntimeWiring();
        GraphiQLSchema schema = new SchemaGenerator().makeExecutableSchema(definitionRegistry);
        graphQL = GraphQL.newGraphQL(Schema).build();
    }
    private RunTimeWiring buildRuntimeWiring(){
        return RuntimeWiring.newRuntimeWiring().build();
    }
}

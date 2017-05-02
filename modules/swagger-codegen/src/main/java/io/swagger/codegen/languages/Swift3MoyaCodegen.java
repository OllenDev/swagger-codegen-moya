package io.swagger.codegen.languages;

import io.swagger.codegen.SupportingFile;

public class Swift3MoyaCodegen extends AbstractSwift3Codegen {

    protected String[] responseAs = new String[0];

    @Override
    public String getName() {
        return "swift3-moya";
    }

    public Swift3MoyaCodegen() {
        super();
        embeddedTemplateDir = templateDir = "swift3/libraries/moya";
        typeMapping.put("file", "Data");

    }

    @Override
    public void processOpts() {
        super.processOpts();

        supportingFiles.add(new SupportingFile("Podspec.mustache", "", projectName + ".podspec"));
        supportingFiles.add(new SupportingFile("Cartfile.mustache", "", "Cartfile"));
        supportingFiles.add(new SupportingFile("Models.mustache", sourceFolder, "Models.swift"));
        supportingFiles.add(new SupportingFile("APIs.mustache", sourceFolder, "API.swift"));
        supportingFiles.add(new SupportingFile("CompositeEncoding.mustache", sourceFolder, "CompositeEncoding.swift"));
        supportingFiles.add(new SupportingFile("Data+MimeType.mustache", sourceFolder, "Data+MimeType.swift"));
    }

    @Override
    public String toApiName(String name) {
        if (name.length() == 0)
            return "APIService";
        return initialCaps(name) + "Service";
    }
}

package org.paninij.apt;

import java.util.List;

import org.paninij.apt.util.SourceFile;
import org.paninij.model.Procedure;

public class DuckMessageSource extends MessageSource
{
    public DuckMessageSource() {
        this.context = null;
    }

    @Override
    protected SourceFile generate(Procedure procedure)
    {
        this.context = procedure;
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected String generateContent()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected String encode()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected String buildPackage()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected List<String> buildConstructor(String prependToBody)
    {
        // TODO Auto-generated method stub
        return null;
    }
}

package org.paninij.proc.check.duckability;

import javax.lang.model.element.TypeElement;

import org.paninij.proc.check.Result;

public interface DuckabilityCheck
{
    /**
     * @param   toDuck  A type element representing some type to be ducked.
     * @return  The result of the duckability check.
     */
    Result checkDuckability(TypeElement toDuck);
}
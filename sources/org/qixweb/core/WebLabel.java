package org.qixweb.core;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;

public class WebLabel implements Comparable
{
    public static final WebLabel NULL = new WebLabel("");
    
    private final String itsString;

    public WebLabel(String aString)
    {
        itsString = aString;
    }

    public String toString()
    {
        return StringUtils.trimToEmpty(StringEscapeUtils.escapeHtml(itsString));
    }

    public int compareTo(Object aComparable)
    {
        return this.toString().compareTo(aComparable.toString());
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof WebLabel)
            return itsString.equals(((WebLabel) obj).itsString);

        else
            return false;

    }

    public int hashCode()
    {
        return itsString.hashCode();
    }
}
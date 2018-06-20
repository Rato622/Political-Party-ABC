<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : newstylesheet.xsl
    Created on : June 20, 2018, 10:56 AM
    Author     : LeratoMusa
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="xml"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <xsl:apply-templates select="member" />
    </xsl:template>
    <xsl:template match="member">
        <client>
            <idno><xsl:value-of select="id" /></idno>
            <firstname><xsl:value-of select="name" /></firstname>
            <lastname><xsl:value-of select="surname" /></lastname>
            <dob><xsl:value-of select="birthdate" /></dob>
            <emailaddrs><xsl:value-of select="emailaddresses" /></emailaddrs>
            <cellnos><xsl:value-of select="cellnumbers" /></cellnos>
            <xsl:apply-templates select="address" />
        </client>
    </xsl:template>
    <xsl:template match="address">
        <address>
            <street><xsl:value-of select="street" /></street>
            <location><xsl:value-of select="area" /></location>
            <code><xsl:value-of select="areaCode" /></code>
        </address>
    </xsl:template>

</xsl:stylesheet>

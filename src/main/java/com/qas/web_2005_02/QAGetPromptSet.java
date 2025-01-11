/*
 * Axelor Business Solutions
 *
 * Copyright (C) 2022 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.qas.web_2005_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

/**
 * Classe Java pour anonymous complex type.
 *
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Country" type="{http://www.qas.com/web-2005-02}ISOType"/&gt;
 *         &lt;element name="Engine" type="{http://www.qas.com/web-2005-02}EngineType" minOccurs="0"/&gt;
 *         &lt;element name="PromptSet" type="{http://www.qas.com/web-2005-02}PromptSetType"/&gt;
 *         &lt;element name="QAConfig" type="{http://www.qas.com/web-2005-02}QAConfigType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"country", "engine", "promptSet", "qaConfig"})
@XmlRootElement(name = "QAGetPromptSet")
public class QAGetPromptSet {

  @Setter
  @Getter
  @XmlElement(name = "Country", required = true)
  protected String country;

  @Setter
  @Getter
  @XmlElement(name = "Engine")
  protected EngineType engine;

  @Setter
  @Getter
  @XmlElement(name = "PromptSet", required = true)
  protected PromptSetType promptSet;

  @XmlElement(name = "QAConfig")
  protected QAConfigType qaConfig;

  public QAConfigType getQAConfig() {
    return qaConfig;
  }

  public void setQAConfig(QAConfigType value) {
    this.qaConfig = value;
  }
}

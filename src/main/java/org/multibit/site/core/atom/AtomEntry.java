package org.multibit.site.core.atom;

import org.joda.time.DateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Represents a single entry within the site
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"id", "title", "link", "updated", "summary"})
public class AtomEntry {

  @XmlElement
  private String id;

  @XmlElement
  private String title;

  @XmlElement
  private AtomLink link;

  @XmlElement
  private DateTime updated;

  @XmlElement
  private String summary;

  public AtomEntry() {
  }

  /**
   * <p>Indicates the mandatory fields for manual creation</p>
   *
   * @param id      A URN containing a UUID (e.g. "urn:uuid:abcd-efgh" etc)
   * @param title   The entry title (e.g. "MultiBit blog")
   * @param updated When the entry was last updated
   * @param link    The link to the main article
   * @param summary A summary of the main article
   */
  public AtomEntry(String id, String title, AtomLink link, DateTime updated, String summary) {

    this.id = id;
    this.title = title;
    this.link = link;
    this.updated = updated;
    this.summary = summary;

  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AtomLink getLink() {
    return link;
  }

  public void setLink(AtomLink link) {
    this.link = link;
  }

  public DateTime getUpdated() {
    return updated;
  }

  public void setUpdated(DateTime updated) {
    this.updated = updated;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }
}
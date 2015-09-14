package pl.metastack.metaweb.tag

import pl.metastack.metarx._
import pl.metastack.metaweb.state

/**
 * The <strong>HTML <code>&lt;b&gt;</code> Element</strong> represents a span of text stylistically different from normal text, without conveying any special importance or relevance. It is typically used for keywords in a summary, product names in a review, or other spans of text whose typical presentation would be boldfaced. Another example of its use is to mark the lead sentence of each paragraph of an article.
<p><strong>Usage notes:</strong></p> 
<ul> 
 <li>Do not confuse the <code>&lt;b&gt;</code> element with the <a href="/en-US/docs/Web/HTML/Element/strong" title="The HTML Strong Element (<strong>) gives text strong importance, and is typically displayed in bold."><code>&lt;strong&gt;</code></a>, <a href="/en-US/docs/Web/HTML/Element/em" title="The&nbsp;HTML Emphasis Element&nbsp;(<em>) marks text that has stress emphasis. The <em> element can be nested, with each level of nesting indicating a greater degree of emphasis."><code>&lt;em&gt;</code></a>, or <a href="/en-US/docs/Web/HTML/Element/mark" title="The HTML Mark&nbsp;Element&nbsp;(<mark>) represents highlighted text, i.e., a run of text marked for reference purpose, due to its relevance in a particular context. For example it can be used in a page showing search results to highlight every instance of the searched-for word."><code>&lt;mark&gt;</code></a> elements. The <a href="/en-US/docs/Web/HTML/Element/strong" title="The HTML Strong Element (<strong>) gives text strong importance, and is typically displayed in bold."><code>&lt;strong&gt;</code></a> element represents text of certain <em>importance</em>, <a href="/en-US/docs/Web/HTML/Element/em" title="The&nbsp;HTML Emphasis Element&nbsp;(<em>) marks text that has stress emphasis. The <em> element can be nested, with each level of nesting indicating a greater degree of emphasis."><code>&lt;em&gt;</code></a> puts some emphasis on the text and the <a href="/en-US/docs/Web/HTML/Element/mark" title="The HTML Mark&nbsp;Element&nbsp;(<mark>) represents highlighted text, i.e., a run of text marked for reference purpose, due to its relevance in a particular context. For example it can be used in a page showing search results to highlight every instance of the searched-for word."><code>&lt;mark&gt;</code></a> element represents text of certain <em>relevance</em>. The <code>&lt;b&gt;</code> element doesn't convey such special semantic information; use it only when no others fit.</li> 
 <li>Similarly, do not mark titles and headings using the <code>&lt;b&gt;</code> element. For this purpose, use the <a href="/en-US/docs/Web/HTML/Element/h1" title="Heading elements implement six levels of document headings, <h1> is the most important and <h6> is the least. A heading element briefly describes the topic of the section it introduces. Heading information may be used by user agents, for example, to construct a table of contents for a document automatically."><code>&lt;h1&gt;</code></a> to <a href="/en-US/docs/Web/HTML/Element/h6" title="Heading elements implement six levels of document headings, <h1> is the most important and <h6> is the least. A heading element briefly describes the topic of the section it introduces. Heading information may be used by user agents, for example, to construct a table of contents for a document automatically."><code>&lt;h6&gt;</code></a> tags. Further, stylesheets can change the default style of these elements, with the result that they are not <em>necessaril</em><em>y</em><em> </em>displayed in bold.</li> 
 <li>It is a good practice to use the <strong>class</strong> attribute on the <code>&lt;b&gt;</code> in order to convey additional semantic information (for example <code>&lt;b class="lead"&gt;</code> for the first sentence in a paragraph). This eases the development of several stylings of a web document, without the need to change its HTML code.</li> 
 <li>Historically, the <code>&lt;b&gt;</code> element was meant to make text boldface. Styling information has been deprecated since HTML4, so the meaning of the <code>&lt;b&gt;</code> element has been changed.</li> 
 <li>If there is no semantic purpose on using the &lt;b&gt; element, using css property <a href="/en-US/docs/CSS/font-weight" title="font-weight">font-weight</a> with bold value would be a better choice for making text bold.</li> 
</ul>
 */
class B extends state.Tag("b") with HTMLTag {
}

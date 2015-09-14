package pl.metastack.metaweb.tag

import pl.metastack.metarx._
import pl.metastack.metaweb.state

/**
 * The <strong>HTML <em><code>&lt;button&gt;</code></em> Element</strong> represents a clickable button.
 */
class Button extends state.Tag("button") with HTMLTag {
  /**
   * This Boolean attribute lets you specify that the button should have input focus when the page loads, unless the user overrides it, for example by typing in a different control. Only one form-associated element in a document can have this attribute specified.
   */
  def autofocus: StateChannel[Boolean] = attribute("autofocus").asInstanceOf[StateChannel[Boolean]]
  /**
   * The use of this attribute on a 
<a href="/en-US/docs/Web/HTML/Element/button" title="The HTML <button> Element represents a clickable button."><code>&lt;button&gt;</code></a> is nonstandard and Firefox-specific. By default, unlike other browsers, 
<a href="http://stackoverflow.com/questions/5985839/bug-with-firefox-disabled-attribute-of-input-not-resetting-when-refreshing" class="external">Firefox persists the dynamic disabled state</a> of a 
<a href="/en-US/docs/Web/HTML/Element/button" title="The HTML <button> Element represents a clickable button."><code>&lt;button&gt;</code></a> across page loads. Setting the value of this attribute to 
<code>off</code> (i.e. 
<code>autocomplete="off"</code>) disables this feature. See 
<a href="https://bugzilla.mozilla.org/show_bug.cgi?id=654072" class="external" title="if disabled state is changed with javascript, the normal state doesn't return after refreshing the page">bug&nbsp;654072</a>.
   */
  def autocomplete: StateChannel[String] = attribute("autocomplete").asInstanceOf[StateChannel[String]]
  /**
   * <p>This Boolean attribute indicates that the user cannot interact with the button. If this attribute is not specified, the button inherits its setting from the containing element, for example <a href="/en-US/docs/Web/HTML/Element/fieldset" title="The HTML <fieldset> element is used to group several controls as well as labels (<label>) within a web form."><code>&lt;fieldset&gt;</code></a>; if there is no containing element with the <strong>disabled</strong> attribute set, then the button is enabled.</p> 
<p>Firefox will, unlike other browsers, by default, <a href="http://stackoverflow.com/questions/5985839/bug-with-firefox-disabled-attribute-of-input-not-resetting-when-refreshing" class="external">persist the dynamic disabled state</a> of a <a href="/en-US/docs/Web/HTML/Element/button" title="The HTML <button> Element represents a clickable button."><code>&lt;button&gt;</code></a> across page loads. Use the <code><a href="/en-US/docs/Web/HTML/Element/button#attr-autocomplete">autocomplete</a></code> attribute to control this feature.</p>
   */
  def disabled: StateChannel[Boolean] = attribute("disabled").asInstanceOf[StateChannel[Boolean]]
  /**
   * The form element that the button is associated with (its 
<em>form owner</em>). The value of the attribute must be the 
<strong>id</strong> attribute of a 
<a href="/en-US/docs/Web/HTML/Element/form" title="The HTML <form> element represents a document section that contains interactive controls to submit information to a web server."><code>&lt;form&gt;</code></a> element in the same document. If this attribute is not specified, the 
<code>&lt;button&gt;</code> element must be a descendant of a form element. This attribute enables you to place 
<code>&lt;button&gt;</code> elements anywhere within a document, not just as descendants of their 
<a href="/en-US/docs/Web/HTML/Element/form" title="The HTML <form> element represents a document section that contains interactive controls to submit information to a web server."><code>&lt;form&gt;</code></a> elements.
   */
  def form: StateChannel[state.Node] = attribute("form").asInstanceOf[StateChannel[state.Node]]
  /**
   * The URI of a program that processes the information submitted by the button. If specified, it overrides the 
<code><a href="/en-US/docs/Web/HTML/Element/form#attr-action">action</a></code> attribute of the button's form owner.
   */
  def formaction: StateChannel[String] = attribute("formaction").asInstanceOf[StateChannel[String]]
  /**
   * If the button is a submit button, this attribute specifies the type of content that is used to submit the form to the server. Possible values are: 
<ul> 
 <li><code>application/x-www-form-urlencoded</code>: The default value if the attribute is not specified.</li> 
 <li><code>multipart/form-data</code>: Use this value if you are using an <a href="/en-US/docs/Web/HTML/Element/input" title="The HTML <input> element is used to create interactive controls for web-based forms in order to accept data from the user. The semantics of an <input> varies considerably depending on the value of its type attribute."><code>&lt;input&gt;</code></a> element with the <code><a href="/en-US/docs/Web/HTML/Element/input#attr-type">type</a></code> attribute set to <code>file</code>.</li> 
 <li><code>text/plain</code></li> 
</ul> 
<p>If this attribute is specified, it overrides the <code><a href="/en-US/docs/Web/HTML/Element/form#attr-enctype">enctype</a></code> attribute of the button's form owner.</p>
   */
  def formenctype: StateChannel[String] = attribute("formenctype").asInstanceOf[StateChannel[String]]
  /**
   * If the button is a submit button, this attribute specifies the HTTP method that the browser uses to submit the form. Possible values are: 
<ul> 
 <li><code>post</code>: The data from the form is included in the body of the form and is sent to the server.</li> 
 <li><code>get</code>: The data from the form are appended to the <strong>form</strong> attribute URI, with a '?' as a separator, and the resulting URI is sent to the server. Use this method when the form has no side-effects and contains only ASCII characters.</li> 
</ul> 
<p>If specified, this attribute overrides the <code><a href="/en-US/docs/Web/HTML/Element/form#attr-method">method</a></code> attribute of the button's form owner.</p>
   */
  def formmethod: StateChannel[String] = attribute("formmethod").asInstanceOf[StateChannel[String]]
  /**
   * If the button is a submit button, this Boolean attribute specifies that the form is not to be validated when it is submitted. If this attribute is specified, it overrides the 
<code><a href="/en-US/docs/Web/HTML/Element/form#attr-novalidate">novalidate</a></code> attribute of the button's form owner.
   */
  def formnovalidate: StateChannel[String] = attribute("formnovalidate").asInstanceOf[StateChannel[String]]
  /**
   * If the button is a submit button, this attribute is a name or keyword indicating where to display the response that is received after submitting the form. This is a name of, or keyword for, a 
<em>browsing context</em> (for example, tab, window, or inline frame). If this attribute is specified, it overrides the 
<code><a href="/en-US/docs/Web/HTML/Element/form#attr-target">target</a></code> attribute of the button's form owner. The following keywords have special meanings: 
<ul> 
 <li><code>_self</code>: Load the response into the same browsing context as the current one. This value is the default if the attribute is not specified.</li> 
 <li><code>_blank</code>: Load the response into a new unnamed browsing context.</li> 
 <li><code>_parent</code>: Load the response into the parent browsing context of the current one. If there is no parent, this option behaves the same way as <code>_self</code>.</li> 
 <li><code>_top</code>: Load the response into the top-level browsing context (that is, the browsing context that is an ancestor of the current one, and has no parent). If there is no parent, this option behaves the same way as <code>_self</code>.</li> 
</ul>
   */
  def formtarget: StateChannel[String] = attribute("formtarget").asInstanceOf[StateChannel[String]]
  /**
   * The name of the button, which is submitted with the form data.
   */
  def name: StateChannel[String] = attribute("name").asInstanceOf[StateChannel[String]]
  /**
   * The type of the button. Possible values are: 
<ul> 
 <li><code>submit</code>: The button submits the form data to the server. This is the default if the attribute is not specified, or if the attribute is dynamically changed to an empty or invalid value.</li> 
 <li><code>reset</code>: The button resets all the controls to their initial values.</li> 
 <li><code>button</code>: The button has no default behavior. It can have client-side scripts associated with the element's events, which are triggered when the events occur.</li> 
</ul>
   */
  def `type`: StateChannel[String] = attribute("type").asInstanceOf[StateChannel[String]]
  /**
   * The initial value of the button.
   */
  def value: StateChannel[String] = attribute("value").asInstanceOf[StateChannel[String]]
}

package pl.metastack.metaweb

import minitest._

object BindingsSpec extends SimpleTestSuite {
  test("Binding `href` on `a` tags") {
    val a = new tag.A
    a.href := "http://example.com/"

    assertEquals(a.toHtml, """<a href="http://example.com/"></a>""")
  }
}
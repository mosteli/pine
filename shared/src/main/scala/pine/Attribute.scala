package pine

case class Attribute[TagName <: SString, G, S](parent: TagRef[TagName], name: String) {
  def set(value: S)(implicit renderCtx: RenderContext): Unit =
    renderCtx.render(Diff.SetAttribute(parent, this, value))

  def update(f: G => G)(implicit renderCtx: RenderContext): Unit =
    renderCtx.render(Diff.UpdateAttribute(parent, this, f))

  def remove()(implicit renderCtx: RenderContext): Unit =
    renderCtx.render(Diff.RemoveAttribute(parent, this))

  def :=(value: S)(implicit renderCtx: RenderContext): Unit = set(value)
}

package passera.unsigned

import scala.math.{ScalaNumber, ScalaNumericConversions}

@serializable
case class UShort(override val shortValue: Short) extends ScalaNumber with SmallUInt[UShort] {
  override def intValue = shortValue & 0xffff
}

object UShort {
  def MinValue = UShort(0)
  def MaxValue = UShort(~0)
}

import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers
import org.hashgeek._

class MyPluginTest extends FunSpec with ShouldMatchers {

  describe("Test my plugin") {
    it("Test plugin usage") {
      MyPlugin.newSetting should not be null
    }
  }

}

import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.stage.StageStyle
import tornadofx.*

class ReminderView: View() {

    override val root = stackpane {
        primaryStage.initStyle(StageStyle.TRANSPARENT)
        primaryStage.opacity = .8
        primaryStage.isMaximized = true
        style{
            backgroundColor += c("#000000")
        }
        vbox{
            style{
                alignment = Pos.CENTER
            }
            imageview("whitePushups.png")//TODO: credit the illustrator, image used from https://www.flaticon.com/free-icon/stick-man-variant-doing-push-ups-from-the-ground_31660
            label("Push Ups"){
                textFill = Color.WHITE
                style{
                    fontSize = 80.px
                }
            }
            hbox{
                style{
                    alignment = Pos.CENTER
                    spacing = 20.px
                }
                button{
                    style{
                        backgroundColor += c("#262626")
                        textFill = Color.WHITE
                    }
                    text = "I did them!"
                    setOnAction {
                        primaryStage.close()
                    }
                }
                button{
                    style{
                        backgroundColor += c("#262626")
                        textFill = Color.WHITE
                    }
                    text = "I'm okay with being fat"
                    setOnAction {
                        primaryStage.close()
                    }
                }
            }

        }
    }

}

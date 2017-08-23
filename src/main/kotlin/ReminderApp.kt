import javafx.application.Platform
import javafx.stage.Stage
import tornadofx.App
import java.util.*

class ReminderApp: App() {
    private val ONE_HOUR: Long = 1000*60*60
    override val primaryView = ReminderView::class
    lateinit private var mainStage: Stage

    override fun start(stage: Stage){
        mainStage = stage
        mainStage.isAlwaysOnTop = true
        Platform.setImplicitExit(false)

        val timer = Timer(true)
        timer.schedule(Reminder(), ONE_HOUR, ONE_HOUR)
    }

    inner class Reminder: TimerTask() {

        override fun run() {
            Platform.runLater {
                startWindow()
            }
        }
    }

    fun startWindow(){
        if(mainStage.scene == null){
            super.start(mainStage)
        }else{
            mainStage.show()
        }

    }

}

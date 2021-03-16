# MustangCommandBased
mini spit cmdbased

mecanum
    4x cansparkmax as usual
        drivetodistance cmd
        turn to angle cmd
intake
    1x talonsrx
        just an on and off method
loader
    1x talonsrx
shooter
    2x talonfx, refer minispit repository for usage
        > Probably inherit from PIDCommand
        startshooter cmd
        stopshooter cmd



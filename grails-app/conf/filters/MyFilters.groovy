class MyFilters {
    def filters = {
        testingCheck(controller: '*', action: '*') {
            before = {
		        println "in MyFilters"
            }
        }
    }
}

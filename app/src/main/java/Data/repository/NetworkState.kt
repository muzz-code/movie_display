package Data.repository

enum class Status {
    RUNNING,
    SUCCESS,
    FAILED
}

class NetworkState(val status: Status, val message: String) {
   companion object {
       val LOADING: NetworkState
       val LOADED: NetworkState
       val ERROR: NetworkState

       init {
           LOADING = NetworkState(Status.RUNNING, "Running")
           LOADED = NetworkState(Status.SUCCESS, "Success")
           ERROR = NetworkState(Status.FAILED, "Something went wrong")
       }
   }
}
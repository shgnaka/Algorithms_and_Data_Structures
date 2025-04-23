public class BinarySearch extends MySearch {
    
    BinarySearch(int max){
        super(max);
    }

    public boolean insert(String key, String data){
        if (maxnum > datanum) {
            MyData newData = new MyData(key, data);
            this.data[datanum] = newData;
            datanum++;
        /* 新規データを正しい位置まで移動させる */
        for(int i = datanum - 1; i > 0; i--){
            if (strcmp(this.data[i-1].getKey(), this.data[i].getKey()) > 0){
                MyData tmp = this.data[i-1];
                this.data[i-1] = this.data[i];
                this.data[i] = tmp;
            }else{
                break;
            }
        }
            return true;
        }else{
            return false;
        }
    }

    public MyData search(String key){
        int index = searchIndex(key);
        if (index == -1) {
            return null;
        }else{
            return data[index];
        }

    }

    public int searchIndex(String key){
        int low = 0;
        int high = datanum -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int status = strcmp(key, data[mid].getKey());
            if (status == 0) {
                return mid;
            } else if (status < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }

    public MyData delete(String key){
        int deleteDataIndex = searchIndex(key);
        if (deleteDataIndex == -1){
            return null;
        }
        MyData deletedData = data[deleteDataIndex];
        for(int i = deleteDataIndex; i < datanum - 1; i++){
            data[i] = data[i+1];
        }
        datanum--;
        return deletedData;
    }
}

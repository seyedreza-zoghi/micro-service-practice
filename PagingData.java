import java.util.List;


public class PagingData<T> {
    private List<T> content;
    private int pageStart;
    private int pageEnd;
    private long totalElements;

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public int getPageStart() {
        return pageStart;
    }

    public void setPageStart(int pageStart) {
        this.pageStart = pageStart;
    }

    public int getPageEnd() {
        return pageEnd;
    }

    public void setPageEnd(int pageEnd) {
        this.pageEnd = pageEnd;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public PagingData(List<T> content, int pageStart, int pageEnd, long totalElements) {
        this.content = content;
        this.pageStart = pageStart;
        this.pageEnd = pageEnd;
        this.totalElements = totalElements;
    }
}

import java.util.List;
import java.util.stream.Collectors;

public class PagingHandler {

    public <T> PagingData<T> getPage(int pageStart, int pageEnd, List<T> items) {
        if (pageStart == 0 && pageEnd == 0) {
            return new PagingData<>(items, 0, items.size(), items.size());
        }
        List<T> paginatedList = items.stream()
                .skip(pageStart * pageEnd)
                .limit(pageEnd)
                .collect(Collectors.toList());

        return new PagingData<>(paginatedList, pageStart, pageEnd, items.size());
    }
}